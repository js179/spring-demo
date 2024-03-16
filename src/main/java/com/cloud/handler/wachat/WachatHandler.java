package com.cloud.handler.wachat;

import com.cloud.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.handler.wachat<br/>
 * 类名称: WachatHandler<br/>
 * 类描述: 发送微信<br/>
 * 创建时间: 2024-03-16 21:25<br/>
 *
 * @author JingShuai
 */
@Component(WachatHandler.TYPE)
public class WachatHandler implements Handler {

  public static final String TYPE = "wechat";

  @Override
  public String sendMessage(String msg) {
    return String.format("发送微信消息成功，消息内容：%s", msg);
  }
}
