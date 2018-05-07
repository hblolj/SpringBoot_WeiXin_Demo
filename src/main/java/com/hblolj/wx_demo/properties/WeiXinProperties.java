package com.hblolj.wx_demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: hblolj
 * @Date: 2018/5/7 15:51
 * @Description:
 * @Version: 1.0
 **/
@Component
@ConfigurationProperties("hblolj.weixin")
public class WeiXinProperties {

    /**
     * 微信服务器的回调地址(当前服务器地址)
     */
    private String callBackServerAddress;
    /**
     * 微信服务号AppId
     */
    private String appId;
    /**
     * 微信服务号AppSecret
     */
    private String appSecret;

    public String getCallBackServerAddress() {
        return callBackServerAddress;
    }

    public void setCallBackServerAddress(String callBackServerAddress) {
        this.callBackServerAddress = callBackServerAddress;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
