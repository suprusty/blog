import "../styles/blogger.css";
import React from "react";
import store from "../store/store";

class Counter extends React.Component{
    constructor(props){
        super(props);
    }

    render(){
        return(
            <div>Number of Blogs: {store.getState().countReducer.count}</div>
        );
    }
};

export default Counter;