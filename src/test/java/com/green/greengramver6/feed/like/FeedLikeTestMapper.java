package com.green.greengramver6.feed.like;

import com.green.greengramver6.feed.like.model.FeedLikeReq;
import com.green.greengramver6.feed.like.model.FeedLikeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FeedLikeTestMapper {
    @Select("SELECT * FROM feed_like WHERE feed_id = #{feedId} AND user_id =#{userId}")
    FeedLikeVo selFeedLikeByFeedIdAndUserId(FeedLikeReq p);

    @Select("SELECT * FROM feed_like")
    List<FeedLikeVo> selFeedLikeAll(); //List는 null 안 넘어옴, 사이즈 0 ArrayList 넘어옴
}
