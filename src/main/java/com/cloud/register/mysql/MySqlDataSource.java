package com.cloud.register.mysql;

import com.cloud.register.DataSource;
import com.cloud.register.DataSourcePool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.register.mysql<br/>
 * 类名称: MySqlDataSource<br/>
 * 类描述: mysql数据源<br/>
 * 创建时间: 2024-03-16 22:18<br/>
 *
 * @author JingShuai
 */
@Slf4j
@Component
public class MySqlDataSource implements DataSource {

  private static final String TYPE = "mysql";

  @Override
  public void registerDataSource() {
    log.info("注册{}数据源成功~", TYPE);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    DataSourcePool.addDataSource(TYPE, this);
  }
}
