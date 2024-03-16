package com.cloud.handler.dingtalk;

import com.cloud.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.handler.dingtalk<br/>
 * 类名称: DingTalkHandler<br/>
 * 类描述: 钉钉<br/>
 * 创建时间: 2024-03-16 21:26<br/>
 *
 * @author JingShuai
 */
@Component(DingTalkHandler.TYPE)
public class DingTalkHandler implements Handler {

  public static final String TYPE = "dingtalk";

  @Override
  public String sendMessage(String msg) {
    return String.format("钉钉通知发送成功，通知内容：%s", msg);
  }
}
