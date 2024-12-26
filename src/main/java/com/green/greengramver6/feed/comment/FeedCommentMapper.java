package com.green.greengramver6.feed.comment;

import com.green.greengramver6.feed.comment.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedCommentMapper {
    void insFeedComment(FeedCommentPostReq p);
    List<FeedCommentDto> selFeedCommentList(FeedCommentGetReq p);
    List<FeedCommentDto> selFeedCommentListByFeedIdsLimit4(List<Long> feedIds);
    List<FeedCommentDto> selFeedCommentListByFeedIdsLimit4Ver2(List<Long> feedIds);
    int delFeedComment(FeedCommentDelReq p);
}