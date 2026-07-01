package com.devtool.docshub.common;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResponse<T> {

    private final boolean success; // 성공 여부
    private final T data;          // 실제 데이터
    private final String message;  // 메시지 (성공/에러 시 안내)

    // 성공 시 호출할 static 메서드
    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .data(data)
                .message("요청에 성공했습니다.")
                .build();
    }

    // 실패 시 호출할 static 메서드
    public static <T> ApiResponse<T> error(String message) {
        return ApiResponse.<T>builder()
                .success(false)
                .data(null)
                .message(message)
                .build();
    }
}
