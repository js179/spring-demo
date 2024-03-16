package com.cloud.handler;

/**
 * 包名称: com.cloud.handler<br/>
 * 类名称: Handler<br/>
 * 类描述: 处理器<br/>
 * 创建时间: 2024-03-16 21:23<br/>
 *
 * @author JingShuai
 */
public interface Handler {

  /**
   * 发送消息
   *
   * @param msg 消息内容
   * @return {@link String }
   * @author JingShuai
   * @Date: 2024-03-16 21:23
   */
  String sendMessage(String msg);
}
