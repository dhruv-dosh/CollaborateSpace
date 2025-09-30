package com.Dhruv.service;

import com.Dhruv.exception.IssueException;
import com.Dhruv.exception.UserException;
import com.Dhruv.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
