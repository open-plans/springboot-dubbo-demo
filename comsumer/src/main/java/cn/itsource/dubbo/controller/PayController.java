package cn.itsource.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.itsource.dubbo.api.PayApi;
import cn.itsource.dubbo.domain.PayInfo;

@RestController
public class PayController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://127.0.0.1:12345",check=false)
    private PayApi payApi;

    @RequestMapping("/getPayInfo")
    public PayInfo getPayInfo(@RequestParam String uuid) {
        return payApi.getPayInfo(uuid);
    }

}