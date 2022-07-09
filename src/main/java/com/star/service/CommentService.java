package com.star.service;

import com.star.entity.Comment;

import java.util.List;

/**
 * @Description: 评论业务层接口
 * @Date: Created in 10:22 2020/6/23
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public interface CommentService {

    //根据博客id查询评论信息
    List<Comment> listCommentByBlogId(Long blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Long id);

}