package com.example.login_demo.util;

public enum ReturnMsg {

    SUCCESS("登陆成功！", true),

    ERROR("请求失败！", false);

    // 成员变量
    private String errMsg;

    private Boolean errCode;

    public String getErrMsg() {
        return errMsg;
    }

    public Boolean getErrCode() {
        return errCode;
    }


    // 构造方法
    ReturnMsg(String errMsg, Boolean errCode) {
        this.errMsg = errMsg;
        this.errCode = errCode;
    }

    // 覆盖方法
    @Override
    public String toString() {
        return this.errCode + "_" + this.errMsg;
    }
}
