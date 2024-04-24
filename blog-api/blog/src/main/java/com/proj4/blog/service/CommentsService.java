package com.proj4.blog.service;

import com.proj4.blog.vo.Result;
import com.proj4.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章id 查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
