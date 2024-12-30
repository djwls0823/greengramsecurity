package com.green.greengramver6.feed.like;

import com.green.greengramver6.feed.like.model.FeedLikeReq;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.validation.annotation.Validated;

@Mapper
@Validated
public interface FeedLikeMapper {
    int insFeedLike(@Valid FeedLikeReq p);
    int delFeedLike(@Valid FeedLikeReq p);
}
