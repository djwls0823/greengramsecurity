package com.green.greengramver6.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;
}