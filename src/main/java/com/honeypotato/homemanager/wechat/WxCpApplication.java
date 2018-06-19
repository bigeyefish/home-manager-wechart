package com.honeypotato.homemanager.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * * @author Binary Wang(https://github.com/binarywang)
 */
@SpringBootApplication
@EnableCaching
public class WxCpApplication {

  public static void main(String[] args) {
    SpringApplication.run(WxCpApplication.class, args);
  }
}
