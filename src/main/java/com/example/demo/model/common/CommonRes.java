package com.example.demo.model.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/9/28.
 */
public class CommonRes implements Serializable {
    private static final long serialVersionUID = 6094615237599920640L;
    public static final int RES_UNKNOW_ERROR = 1000;
    public static final int RES_UNSUPPORT = 1001;
    public static final int RES_INVALID_PARAM = 1002;
    public static final int RES_DAOEXCEPTION = 1003;
    public static final int RES_RUNTIME_EXCEPTION = 1004;
    public static final int RES_NO_RIGHT = 1005;
    public static final int RES_NEED_SIGNIN = 1006;
    public static final int RES_AUTH_FAILED = 1007;
    public static final int RES_INVALID_TOKEN = 1008;
    public static final int RES_NEED_AUTH = 1009;
    public static final int RES_TIMEOUT = 1010;
    public static final int RES_NOT_ALLOW = 1011;
    private int rc = 0;
    private String msgInfo;
    private String errorInfo;
    private Date serverTime;
    private String logTrackInfo;

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    public String getLogTrackInfo() {
        return logTrackInfo;
    }

    public void setLogTrackInfo(String logTrackInfo) {
        this.logTrackInfo = logTrackInfo;
    }
}
