import "../styles/blogger.css";
import React from "react";
import Home from "./home.jsx";
import AddForm from "./AddForm.jsx";
import Blogs from "./Blogs.jsx";
import Counter from "./Counter.jsx";
import store from "../store/store.js";
import {fetchBlogs} from "../actions/actions.js";

import {BrowserRouter as Router, Route, Link} from 'react-router-dom';

class Blogger extends React.Component{
	constructor(props){
		super(props);

        store.subscribe( () => this.forceUpdate() );
        store.dispatch(fetchBlogs());
    }

	render(){
        return (
            <Router>
            <div>
                <h1>Cisco Blogger</h1>
                <Link to="/">Home</Link> | <Link to="/add">Add Blog</Link> | <Link to="/list">List Blogs</Link>
                <hr/>
                <Counter/>
                <Route exact path="/" component={Home}/>
                <Route path="/add" component={AddForm}/>
                <Route path='/list' render={(props) => (
                    <Blogs {...props} store={store}/>
                )}/>
            </div>
            </Router>
        );
	}
};

export default Blogger;