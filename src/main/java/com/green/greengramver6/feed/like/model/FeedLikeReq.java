package com.green.greengramver6.feed.like.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedLikeReq {
    private long feedId;

    @JsonIgnore
    private long userId;
}
