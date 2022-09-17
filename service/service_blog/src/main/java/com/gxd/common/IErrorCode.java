package com.gxd.common;
/**
 * 封装API的错误码
 *
 * @author xuandongguo
 */
public interface IErrorCode {
    /**
     * 得到code
     * @return
     */
    long getCode();

    /**
     * http返回信息
     * @return
     */
    String getMessage();
}

