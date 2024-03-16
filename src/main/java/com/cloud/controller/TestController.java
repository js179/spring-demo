package com.cloud.controller;

import com.cloud.handler.Handler;
import com.cloud.handler.HandlerFactory;
import com.cloud.register.DataSource;
import com.cloud.register.DataSourcePool;
import com.cloud.response.ResponseResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 包名称: com.cloud.controller<br/>
 * 类名称: TestController<br/>
 * 类描述: 测试接口<br/>
 * 创建时间: 2024-03-16 21:41<br/>
 *
 * @author JingShuai
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

  private final HandlerFactory factory;

  private final DataSourcePool pool;

  @GetMapping("/{type}")
  public ResponseResult sendMsg(@PathVariable("type") String type, @RequestParam String msg) {
    Handler handler = factory.getHandler(type);
    return ResponseResult.ok(handler.sendMessage(msg));
  }

  @GetMapping("/list")
  public ResponseResult getList() {
    List<String> list = pool.getDataSourceTypeList();
    return ResponseResult.ok(list);
  }

  @GetMapping("/datasource")
  public ResponseResult getDataSource(@RequestParam String type) {
    DataSource dataSource = pool.getDataSource(type);
    if (dataSource != null) {
      dataSource.registerDataSource();
      return ResponseResult.ok("数据源注册成功");
    } else {
      return ResponseResult.error(String.format("%s数据源暂时不支持", type));
    }
  }

  @GetMapping("/error")
  public ResponseResult error() {
    return ResponseResult.error("请求异常");
  }
}
