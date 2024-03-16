package com.cloud.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * 包名称: com.cloud.configure<br/>
 * 类名称: SwaggerConfig<br/>
 * 类描述: swagger配置<br/>
 * 创建时间: 2024-03-16 22:46<br/>
 *
 * @author JingShuai
 */
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            // 是否开启swagger
            .enable(true)
            .select()
            // 过滤条件，扫描指定路径下的文件
            .apis(RequestHandlerSelectors.basePackage("com.cloud.controller"))
            // 指定路径处理，PathSelectors.any()代表不过滤任何路径
            //.paths(PathSelectors.any())
            .build();
  }

  private ApiInfo apiInfo() {
    Contact contact = new Contact("秋枫", "https://github.com/js179", "jingshuai179@qq.com");
    return new ApiInfo(
            "Spring Boot SwaggerUi3",
            "Spring Boot SwaggerUi3",
            "v1.0",
            "https://127.0.0.1",
            contact,
            "Apache 2.0",
            "https://www.apache.org/licenses/LICENSE-2.0",
            Collections.emptyList()
    );
  }
}
