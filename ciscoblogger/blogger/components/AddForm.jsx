import "../styles/blogger.css";
import React from "react";
import store from "../store/store.js";
import {addBlog} from "../actions/actions.js";

class AddForm extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            id: "",
            subject: "",
            blogDecc: ""
        }
        
        this.changeID = this.changeID.bind(this);
        this.changeSubject = this.changeSubject.bind(this);
        this.changeBlogDecc = this.changeBlogDecc.bind(this);
        this.addBlog = this.addBlog.bind(this);
    }

    changeID(e){
        this.setState({
            id: e.target.value
        });
    }

    changeSubject(e){
        this.setState({
            subject: e.target.value
        });
    }

    changeBlogDecc(e){
         this.setState({
            blogDecc: e.target.value
        });
    }

    addBlog(e){
        e.preventDefault();
        store.dispatch(addBlog(this.state));
        this.props.history.push('/list');
    }

    render(){
        return (
            <form onSubmit={this.addBlog} >
                <h2>Add New Blog</h2>
                ID <input name="id" placeholder="ID Number" defaultValue={ this.state.id }
                   onChange={this.changeID} 
                />
                Subject <input name="subject" placeholder="Blog Subject" defaultValue={ this.state.subject }
                   onChange={this.changeSubject} 
                />
                Blog Description <input name="blogDecc" placeholder="Blog Description" defaultValue={this.state.blogDecc} 
                    onChange={this.changeBlogDecc}
                />
                <button>Add</button>
            </form>
        );
    }
};

export default AddForm;