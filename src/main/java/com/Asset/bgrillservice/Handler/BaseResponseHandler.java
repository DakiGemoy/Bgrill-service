package com.Asset.bgrillservice.Handler;

import lombok.Data;

@Data
public class BaseResponseHandler {
    private Integer code;
    private String message;
    private String exception;
    private Object data;
}
