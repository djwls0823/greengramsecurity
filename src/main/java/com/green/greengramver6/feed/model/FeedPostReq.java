package com.green.greengramver6.feed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FeedPostReq {
    @JsonIgnore
    private long feedId;

    @JsonIgnore
    private long writerUserId;

    @Size(max = 1000, message = "내용은 1,000자 이하만 가능합니다.")
    @Schema(title = "피드 내용", example = "피드 내용 테스트")
    private String contents;

    @Size(max = 30, message = "위치는 30자 이하만 가능합니다.")
    @Schema(title = "피드 위치", example = "그린컴퓨터학원")
    private String location;
}
