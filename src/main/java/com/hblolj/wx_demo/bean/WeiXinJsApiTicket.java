package com.hblolj.wx_demo.bean;

public class WeiXinJsApiTicket {
    /**
     * 错误码
     */
    private String errcode;
    /**
     * 错误信息
     */
    private String errmsg;
    /**
     * api_ticket，卡券接口中签名所需凭证
     */
    private String ticket;
    /**
     * 有效时间
     */
    private String expires_in;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
}
