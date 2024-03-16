package com.cloud.handler.feishu;

import com.cloud.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.handler.feishu<br/>
 * 类名称: FeishuHandler<br/>
 * 类描述: 飞书通知<br/>
 * 创建时间: 2024-03-16 21:42<br/>
 *
 * @author JingShuai
 */
@Component(FeishuHandler.TYPE)
public class FeishuHandler implements Handler {

  public static final String TYPE = "feishu";

  @Override
  public String sendMessage(String msg) {
    return String.format("已为你开启飞书会议，会议内容为：%s", msg);
  }
}
