export const ACTION_TYPES = {
    ADDED_BLOG: 'added_blog',
    REMOVED_BLOG: 'removed_blog',
    FETCHED_BLOGS: 'fetched_blogs'
}
export function addBlog(blog) {
    return {
        type: ACTION_TYPES.ADDED_BLOG,
        blog: blog
    };
}

export function removeBlog(id) {
    return {
        type: ACTION_TYPES.REMOVED_BLOG,
        id: id
    };
}

export function fetchBlogs() {
    return {
        type: ACTION_TYPES.FETCHED_BLOGS
    };
}