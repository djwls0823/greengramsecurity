package com.green.greengramver6.feed;

import com.green.greengramver6.feed.model.FeedPicVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FeedPicTestMapper {
    @Select("SELECT * FROM feed_pic WHERE feed_id = #{feedId}")
    List<FeedPicVo> selFeedPicListByFeedId(long feedId);
}
