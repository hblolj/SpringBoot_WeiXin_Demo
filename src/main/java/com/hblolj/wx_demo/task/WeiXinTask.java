package com.hblolj.wx_demo.task;

import com.hblolj.wx_demo.properties.WeiXinProperties;
import com.hblolj.wx_demo.utils.TokenUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: hblolj
 * @Date: 2018/5/7 15:56
 * @Description: 微信任务类
 * @Version: 1.0
 **/
@Component
public class WeiXinTask {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WeiXinProperties weiXinProperties;

    /**
     * 每个小时的第 55 分钟刷新获取微信AccessToken
     */
    @Scheduled(cron = "0 55 * * * *")
    public void refreshAccessToken(){
        logger.info("refreshAccessToken");
        TokenUtils.getInstance().getToken(weiXinProperties.getAppId(), weiXinProperties.getAppSecret());
        TokenUtils.getInstance().getJSAPI_Ticket(weiXinProperties.getAppId(), weiXinProperties.getAppSecret());
        logger.info("accessToken: {}" + TokenUtils.getInstance().getACCESS_TOKEN());
    }
}
