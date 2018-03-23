import {ACTION_TYPES} from "../actions/actions.js";

export function blogReducer(state={blogs:[]}, action){
    switch(action.type){
        case ACTION_TYPES.ADDED_BLOG:
            let blogs = [...state.blogs, action.blog];
            return {
                blogs: blogs
            };
        case ACTION_TYPES.REMOVED_BLOG:
            blogs = state.blogs.filter(function(b){
                return b.id != action.id
            });
            return {
                blogs: blogs
            };
        case ACTION_TYPES.FETCHED_BLOGS:
            return action.blogs;
        default:
            return {
                blogs: []
            };
    }
};