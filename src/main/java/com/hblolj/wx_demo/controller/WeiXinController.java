package com.hblolj.wx_demo.controller;

import com.hblolj.wx_demo.properties.WeiXinProperties;
import com.hblolj.wx_demo.utils.TokenUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: hblolj
 * @Date: 2018/5/7 15:21
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class WeiXinController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WeiXinProperties weiXinProperties;

    @GetMapping("/scan")
    public Map<String, String> scan(HttpServletRequest request, @RequestParam String address){
        StringBuffer requestURL = new StringBuffer();
        requestURL.append(address);
        logger.info("requestURL: {}", requestURL);
        String jsUrl = requestURL.toString();
        Map<String, String> sign = TokenUtils.getInstance().config(jsUrl, weiXinProperties.getAppId(), weiXinProperties.getAppSecret());
        return sign;
    }
}
