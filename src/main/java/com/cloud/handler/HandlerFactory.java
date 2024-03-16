package com.cloud.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * 包名称: com.cloud.handler<br/>
 * 类名称: AbstractHandlerFactory<br/>
 * 类描述: 抽象<br/>
 * 创建时间: 2024-03-16 21:23<br/>
 *
 * @author JingShuai
 */
@Component
@RequiredArgsConstructor
public class HandlerFactory {

  private final Map<String, Handler> handlerMap;

  private Handler handler;

  @Autowired
  @Qualifier(DefaultHandler.TYPE)
  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  public Handler getHandler(String type) {
    return Optional.ofNullable(handlerMap.get(type))
            .orElse(this.handler);
  }
}
