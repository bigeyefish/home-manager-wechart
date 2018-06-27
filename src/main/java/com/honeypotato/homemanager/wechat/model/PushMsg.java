package com.honeypotato.homemanager.wechat.model;

/**
 * 推送数据实体
 * Created by sanyihwang on 2018/6/22.
 */
public class PushMsg {

    /* 消息内容 */
    private String content;

    /* 企业号应用id */
    private int agentId;

    /* 消息接收者（多个用'|'分隔），默认发送全部 */
    private String toUser;

    private String toParty;

    private String toTag;

    public PushMsg() {
        toUser = "@all";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getToParty() {
        return toParty;
    }

    public void setToParty(String toParty) {
        this.toParty = toParty;
    }

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    @Override
    public String toString() {
        return "PushMsg{" +
                "content='" + content + '\'' +
                ", agentId=" + agentId +
                ", toUser='" + toUser + '\'' +
                ", toParty='" + toParty + '\'' +
                ", toTag='" + toTag + '\'' +
                '}';
    }
}
