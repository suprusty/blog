export function countReducer(state={count:0}, action){
    switch(action.type){
        case 'added_blog':
            let count = state.count+1;
            return {
                count: count
            };
        case 'removed_blog':
            count = state.count-1;
            return {
                count: count
            };
        case 'fetched_blogs':
            return {
                count: action.count
            };
        default:
            return {
                count: 50
            };
    }
};