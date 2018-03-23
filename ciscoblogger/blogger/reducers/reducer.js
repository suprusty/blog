import { combineReducers } from 'redux'
import {blogReducer} from './blogReducer'
import {countReducer} from './countReducer'

export default combineReducers({
  blogReducer,
  countReducer
})