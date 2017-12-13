### 本项目为家庭管理系统企业号后台代码。代码结构fork自 [weixin-java-tools的Demo演示程序](https://gitee.com/binary/weixin-java-cp-demo) 。
#### 项目基于Spring Boot构建，实现微信企业号开发功能。更多信息请查阅：https://github.com/Wechat-Group/weixin-java-tools

[![Build Status](https://travis-ci.org/bigeyefish/home-manager-wechart.svg?branch=master)](https://travis-ci.org/bigeyefish/home-manager_wechart)
-----------------------

## 使用步骤：
1. 配置：复制`/src/main/resources/application.yml.template` 生成application.yml文件，根据自己需要填写相关配置（需要注意的是：yml文件内的属性冒号后面的文字之前需要加空格，可参考已有配置，否则属性会设置不成功）；	
1. 运行Java程序：`com.honeypotato.homemanager.wechat.WxCpApplication`；
1. 打开shell或cmd，进入ngrok目录，运行 `ngrok -config ngrok.cfg -subdomain honeypotato 8080` 如果运行失败，请更换honeypotato为其它字符串，直至连接成功；
1. 配置微信企业号（企业微信）中的接口地址：http://honeypotato.tunnel.qydev.com/wx/cp/portal （注意honeypotato要跟上面的一致，需要符合微信官方的要求）；	
