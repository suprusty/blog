import {ACTION_TYPES} from "../actions/actions.js";

function proxy(store){
	return function(next){
		return function(action){
			if(action.type == ACTION_TYPES.ADDED_BLOG){
				fetch('/blog', {
					method: 'post',
					data: action.blog
				}).then(function(response){
					return next(action);
				});
			}
			if(action.type == ACTION_TYPES.REMOVED_BLOG){
				fetch(`/blog/${action.id}`, {
					method: 'delete'
				}).then(function(response){
					return next(action);
				});
			}
			if(action.type == ACTION_TYPES.FETCHED_BLOGS){
				//fetch('/blogger/data/blogs.json')
				fetch('http://localhost:8080/ciscoblog/services/blogs')
				.then(function(response){
					console.log("Response from REST API: "+response.body);
					return response.json();
				}).then(function(blogs){
					action.blogs = blogs;
					action.count = blogs.length;
					return next(action);
				})
			}
		}
	}
};

export default proxy;
