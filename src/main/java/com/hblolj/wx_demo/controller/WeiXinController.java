package com.hblolj.wx_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hblolj
 * @Date: 2018/5/7 15:21
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class WeiXinController {

    @GetMapping("/scan")
    public String scan(){
        return "scan";
    }
}
