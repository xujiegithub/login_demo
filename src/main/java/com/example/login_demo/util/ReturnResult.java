package com.example.login_demo.util;


import lombok.Data;

@Data
public class ReturnResult {

    private Object info;
    private Boolean success;
    private String msg;

    //自定义success,msg,info
    private ReturnResult(Boolean success, String msg,Object info) {
        this.info = info;
        this.success = success;
        this.msg = msg;
    }
    //info
    private ReturnResult(Object info) {
        this.success = ReturnMsg.SUCCESS.getErrCode();
        this.msg = ReturnMsg.SUCCESS.getErrMsg();
        this.info = info;
    }
    //自定义code,msg
    private ReturnResult(Boolean success,String msg){
        this.success =  success;
        this.msg = msg;
    }


    private ReturnResult() {
        this.success = ReturnMsg.SUCCESS.getErrCode();
        this.msg = ReturnMsg.SUCCESS.getErrMsg();
    }
    /***
     * 输入参数:
     *
     *
     * @param info
     * @param success
     * @param msg
     * @return 返回成功，包含total、code、msg、info
     */
    public static ReturnResult success(Boolean success, String msg, Object info) {
        return new ReturnResult(success,msg,info);
    }

    public static ReturnResult success(Boolean success, String msg){
        return new ReturnResult(success,msg);
    }

    public static ReturnResult error (String msg){
        return new ReturnResult(ReturnMsg.ERROR.getErrCode(),msg);
    }
    public static ReturnResult error (String msg, Object info){
        return new ReturnResult(ReturnMsg.ERROR.getErrCode(),msg,info);
    }
    /***
     * 输入参数：
     *
     * @param info
     * @return 返回成功，包含code、msg、data
     */
    public static ReturnResult success(Object info) {
        return new ReturnResult(info);
    }

    public static ReturnResult success(){
        return new ReturnResult();
    }

    public String toString()
    {
        return "ReturnResult(success=" + getSuccess() + ", msg=" + getMsg() + ", info=" + getInfo() + ")";
    }

}
