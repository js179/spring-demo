package com.cloud.handler;

import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.handler<br/>
 * 类名称: DefaultHandler<br/>
 * 类描述: 默认方式<br/>
 * 创建时间: 2024-03-16 21:40<br/>
 *
 * @author JingShuai
 */
@Component(DefaultHandler.TYPE)
public class DefaultHandler implements Handler {

  public static final String TYPE = "default";

  @Override
  public String sendMessage(String msg) {
    return String.format("发送站内消息成功，消息内容：%s", msg);
  }
}
