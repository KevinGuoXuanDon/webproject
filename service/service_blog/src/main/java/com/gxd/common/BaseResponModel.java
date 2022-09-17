package com.gxd.common;

/**
 * @author Xuandong Guo
 * @date 17/09/2022
 */
public class BaseResponModel<T>{
    private Integer status = -1;
    private String message;
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> BaseResponModel<T> getInstance(Integer status) {
        BaseResponModel<T> baseMethodResponseModel = new BaseResponModel<>();
        baseMethodResponseModel.status = status;
        return baseMethodResponseModel;
    }

    public static <T> BaseResponModel<T> getInstance(Integer status, String message) {
        BaseResponModel<T> baseMethodResponseModel = new BaseResponModel<>();
        baseMethodResponseModel.status = status;
        baseMethodResponseModel.message = message;
        return baseMethodResponseModel;
    }

    public static <T> BaseResponModel<T> getInstance(Integer status, String message, T data) {
        BaseResponModel<T> baseMethodResponseModel = new BaseResponModel<>();
        baseMethodResponseModel.status = status;
        baseMethodResponseModel.message = message;
        baseMethodResponseModel.data = data;
        return baseMethodResponseModel;
    }

    public static <T> BaseResponModel<T> getSuccessInstance(String message) {
        return getInstance(ResponseStatus.SUCCESS.getCode(), message);
    }

    public static <T> BaseResponModel<T> getSuccessInstance(String message, T data) {
        return getInstance(ResponseStatus.SUCCESS.getCode(), message, data);
    }

    public static <T> BaseResponModel<T> getFailureInstance(String message) {
        return getInstance(ResponseStatus.FAILURE.getCode(), message);
    }

    public static <T> BaseResponModel<T> getFailureInstance(String message, T data) {
        return getInstance(ResponseStatus.FAILURE.getCode(), message, data);
    }

    public enum ResponseStatus {
        SUCCESS(1,"SUCCESS"),
        FAILURE(0,"FAILURE");
        private final Integer code;
        private final String desc;

        ResponseStatus(Integer code, String desc) {
            this.code = code;
            this.desc =desc;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public boolean isSuccess() {
        return status.equals(ResponseStatus.SUCCESS.getCode());
    }
}
