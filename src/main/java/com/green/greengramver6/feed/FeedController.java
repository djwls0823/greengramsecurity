package com.green.greengramver6.feed;

import com.green.greengramver6.common.model.ResultResponse;
import com.green.greengramver6.feed.model.*;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("feed")
public class FeedController {
    private final FeedService service;

    @PostMapping
    @Operation(summary = "피드 등록", description = "필수: 사진리스트 || 옵션: 위치, 내용")
    public ResultResponse<FeedPostRes> postFeed(@RequestPart List<MultipartFile> pics
                                              , @Valid  @RequestPart FeedPostReq p) {
        FeedPostRes res = service.postFeed(pics, p);
        return ResultResponse.<FeedPostRes>builder()
                .resultMessage("피드 등록 완료")
                .resultData(res)
                .build();
    }

    @GetMapping
    @Operation(summary = "Feed 리스트 - N+1", description = "signed_user_id는 로그인한 사용자의 pk")
    public ResultResponse<List<FeedGetRes>> getFeedList(@Valid @ParameterObject @ModelAttribute FeedGetReq p) {
        log.info("FeedController > getFeedList > p: {}", p);
        List<FeedGetRes> list = service.getFeedList(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                .resultMessage(String.format("%d rows", list.size()))
                .resultData(list)
                .build();
    }

    @GetMapping("ver3")
    @Operation(summary = "Feed 리스트 - No N+1", description = "signed_user_id는 로그인한 사용자의 pk")
    public ResultResponse<List<FeedGetRes>> getFeedListVer3(@Valid @ParameterObject @ModelAttribute FeedGetReq p) {
        log.info("FeedController > getFeedList > p: {}", p);
        List<FeedGetRes> list = service.getFeedList3(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                .resultMessage(String.format("%d rows", list.size()))
                .resultData(list)
                .build();
    }

    @DeleteMapping
    @Operation(summary = "Feed 삭제", description = "피드의 댓글, 좋아요 모두 삭제 처리")
    public ResultResponse<Integer> deleteFeed(@ParameterObject @ModelAttribute FeedDeleteReq p) {
        log.info("FeedController > deleteFeed > p: {}", p);
        int result = service.deleteFeed(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("피드가 삭제되었습니다.")
                .resultData(result)
                .build();
    }
}