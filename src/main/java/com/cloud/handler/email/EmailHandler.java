package com.cloud.handler.email;

import com.cloud.handler.Handler;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.handler.email<br/>
 * 类名称: EmailHandler<br/>
 * 类描述: 邮件发送<br/>
 * 创建时间: 2024-03-16 21:27<br/>
 *
 * @author JingShuai
 */
@Component(EmailHandler.TYPE)
public class EmailHandler implements Handler {

  public static final String TYPE = "email";

  @Override
  public String sendMessage(String msg) {
    return String.format("发送邮件email成功，邮件内容：%s", msg);
  }
}
