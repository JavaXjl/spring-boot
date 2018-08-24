package com.xjl.crm.resp;

import java.io.Serializable;

/**
 * Created by huanglian on 16/12/1.
 * 返回结
 */
public class Result<T> implements Serializable {

    /**
     * 接口调用成功，不需要返回对象
     */
    public static <T> Result<T> newSuccess(){
        Result<T> result = new Result<>();
        return result;
    }

    /**
     * 接口调用成功，有返回对象
     */
    public static <T> Result<T> newSuccess(T object) {
        Result<T> result = new Result<>();
        result.setData(object);
        return result;
    }

    /**
     * 接口调用失败，有错误码和描述，没有返回对象
     */
    public static <T> Result<T> newFailure(int code, String msg){
        Result<T> result = new Result<>();
        result.setCode(code!=0 ? code : -1);
        result.setMsg(msg);
        return result;
    }

    /**
     * 接口调用失败，有错误字符串码和描述，没有返回对象
     */
    public static <T> Result<T> newHttpFailure(Integer httpStatusCode, int code, String msg, String detail){
        Result<T> result = new Result<>();
        result.setHttpStatusCode(httpStatusCode);
        result.setCode(code);
        result.setDetail(detail);
        result.setMsg(msg);
        return result;
    }

    //返回code
    private Integer httpStatusCode = 200;
    //业务返回码，0.正确
    private int code;
    //返回的数据
    private T data;
    //返回的错误消息
    private String msg;
    //消息的细节
    private String detail;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
