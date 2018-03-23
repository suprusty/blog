import "../styles/blogger.css";
import React from "react";
import Blog from "./Blog.jsx";
import store from "../store/store.js";

class Blogs extends React.Component{
    constructor(props){
        super(props);
    }

    render(){
        return(
             <table>
                <tbody>
                    <tr><th>ID</th><th>Subject</th><th>Blog Decsription</th></tr>
                    { 
                        store.getState().blogReducer.map(blog => (
                            <Blog subject={ blog.subject } key={blog.id} id={blog.id} blogDecc={blog.blogDecc}>
                            </Blog>
                        )) 
                    }
                </tbody>
            </table>
        );
    }
};

export default Blogs;