package com.honeypotato.homemanager.wechat.redis;

import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2018/6/19.
 */
@Component
public class Receiver {

    public Receiver() {
        System.out.println("staring to subscribe redis key hm");
    }

    public void receiveMessage(String message) {
        System.out.println(String.format("Received message: %s", message));
    }
}
