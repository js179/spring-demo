package com.cloud.register;

import org.springframework.beans.factory.InitializingBean;

/**
 * 包名称: com.cloud.register<br/>
 * 类名称: DataSource<br/>
 * 类描述: 数据源注册<br/>
 * 创建时间: 2024-03-16 21:57<br/>
 *
 * @author JingShuai
 */
public interface DataSource extends InitializingBean {

  String TYPE = "default";

  /**
   * 注册数据源
   *
   * @author JingShuai
   * @Date: 2024-03-16 21:57
   */
  void registerDataSource();
}
