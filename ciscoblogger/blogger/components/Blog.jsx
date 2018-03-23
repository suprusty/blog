import "../styles/blogger.css";
import React from "react";
import store from "../store/store.js";
import {removeBlog} from "../actions/actions.js";

class Blog extends React.Component{
    constructor(props){
        super(props);
        this.removeBlog = this.removeBlog.bind(this);
    }

    removeBlog(){
        store.dispatch(removeBlog(this.props.id));
    }

    render(){
        return(
            <tr>
                <td>{ this.props.id }</td>
                <td>{ this.props.subject }</td>
                <td>{ this.props.blogDecc }</td>
                <td><button onClick={this.removeBlog}>Delete</button></td>
            </tr>
        );
    }
};

export default Blog;