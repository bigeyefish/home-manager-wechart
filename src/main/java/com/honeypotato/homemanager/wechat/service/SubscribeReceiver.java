package com.honeypotato.homemanager.wechat.service;

import com.alibaba.fastjson.JSONObject;
import com.honeypotato.homemanager.wechat.model.PushMsg;
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
            PushMsg pushMsg = JSONObject.parseObject(message, PushMsg.class);
            WxCpMessageSendResult result = wxCpService.messageSend(WxCpMessage.TEXT().content(pushMsg.getContent()).toUser(pushMsg.getToUser()).build());
            System.out.println(result);
        } catch (WxErrorException e) {
            System.out.println(message);
            e.printStackTrace();
        }
    }
}
