package com.honeypotato.homemanager.wechat.service;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.bean.WxCpMessageSendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2018/6/19.
 */
@Component
public class SubscribeReceiver {

    @Autowired
    private WxCpService wxCpService;

    public SubscribeReceiver() {
        System.out.println("staring to subscribe redis key hm");
    }

    public void receiveMessage(String message) {
        try {
            WxCpMessageSendResult result = wxCpService.messageSend(WxCpMessage.TEXT().content("收到信息:" + message).toUser("wangshiyu").build());
            System.out.println(result);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Received message: %s", message));
    }
}
