package com.green.greengramver6.feed.model;

import com.green.greengramver6.feed.comment.model.FeedCommentGetRes;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Schema(title = "피드 정보")
@ToString
@NoArgsConstructor
public class FeedGetRes {
    private long feedId;
    private String contents;
    private String location;
    private String createdAt;
    private long writerUserId;
    private String writerNm;
    private String writerPic;
    private int isLike;

    private List<String> pics;
    private FeedCommentGetRes comment;

    public FeedGetRes(FeedWithPicCommentDto dto) {
        this.feedId = dto.getFeedId();
        this.contents = dto.getContents();
        this.location = dto.getLocation();
        this.createdAt = dto.getCreatedAt();
        this.writerUserId = dto.getWriterUserId();
        this.writerNm = dto.getWriterNm();
        this.writerPic = dto.getWriterPic();
        this.isLike = dto.getIsLike();
        this.pics = dto.getPics();
        this.comment = new FeedCommentGetRes();
        // dto.getCommentList().size()값이 4라면
        if (comment == null) {
            comment = new FeedCommentGetRes();
            comment.setCommentList(new ArrayList<>());
        } else if (comment.getCommentList().size() == 4) {
            comment.setMoreComment(true);
            comment.getCommentList().remove(comment.getCommentList().size() - 1);
        }
    }
}
