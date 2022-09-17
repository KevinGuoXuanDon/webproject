package com.gxd.common;

/**
 * @author Xuandong Guo
 * @date 17/09/2022
 */
public class BaseModel <T>{
    private Integer code = 200;
    private String msg = "";
    private T data;

    /**
     * 成功时创建一个实例返回
     * @return
     */
    public static <T> BaseModel<T> getInstance(T data){
        BaseModel<T> model = new BaseModel<>();
        model.data = data;
        return model;
    }

    public static <T> BaseModel<T> getFailureInstance(String message){
        return getFailureInstance(null,message);
    }
    public static <T> BaseModel<T> getFailureInstance(T data, String message){
        BaseModel<T> model = new BaseModel<>();
        model.data = data;
        model.msg = message;
        model.code = HttpHelper.REST_STATE_ERROR;
        return model;
    }

    public static <T> BaseModel<T> getSuccessfulInstance(T data, String message){
        BaseModel<T> model = new BaseModel<>();
        model.data = data;
        model.msg = message;
        model.code = HttpHelper.REST_STATE_OK;
        return model;
    }

    public static <T> BaseModel<T> getSuccessfulInstance(String message){
        return getSuccessfulInstance(null,message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
