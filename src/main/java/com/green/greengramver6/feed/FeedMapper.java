package com.green.greengramver6.feed;

import com.green.greengramver6.feed.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    int insFeed(FeedPostReq p);
    List<FeedGetRes> selFeedList(FeedGetReq p);
    List<FeedAndPicDto> selFeedWithPicList(FeedGetReq p);
    List<FeedWithPicCommentDto> selFeedWithPicAndCommentLimit4List(FeedGetReq p);

    int delFeedLikeAndFeedCommentAndFeedPic(FeedDeleteReq p);
    int delFeed(FeedDeleteReq p);
}
