package com.cloud.configure;

import io.undertow.server.DefaultByteBufferPool;
import io.undertow.websockets.jsr.WebSocketDeploymentInfo;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.configure<br/>
 * 类名称: CustomizationBean<br/>
 * 类描述: 自定义<br/>
 * 创建时间: 2024-03-16 21:53<br/>
 *
 * @author JingShuai
 */
@Component
public class WebSocketWebServerFactoryCustomizer implements WebServerFactoryCustomizer<UndertowServletWebServerFactory> {

  @Override
  public void customize(UndertowServletWebServerFactory factory) {
    factory.addDeploymentInfoCustomizers(deploymentInfo -> {
      WebSocketDeploymentInfo webSocketDeploymentInfo = new WebSocketDeploymentInfo();
      webSocketDeploymentInfo.setBuffers(new DefaultByteBufferPool(false, 1024));
      deploymentInfo.addServletContextAttribute(WebSocketDeploymentInfo.class.getName(), webSocketDeploymentInfo);
    });
  }
}
