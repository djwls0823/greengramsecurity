package com.green.greengramver6.feed.model;

import com.green.greengramver6.feed.comment.model.FeedCommentDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FeedWithPicCommentDto {
    private long feedId;
    private String contents;
    private String location;
    private String createdAt;
    private long writerUserId;
    private String writerNm;
    private String writerPic;
    private int isLike;
    private List<String> pics;
    private List<FeedCommentDto> commentList;
}
