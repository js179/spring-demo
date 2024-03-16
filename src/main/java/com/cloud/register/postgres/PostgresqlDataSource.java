package com.cloud.register.postgres;

import com.cloud.register.DataSource;
import com.cloud.register.DataSourcePool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.register.postgres<br/>
 * 类名称: PostgresqlDataSource<br/>
 * 类描述: postgres数据源<br/>
 * 创建时间: 2024-03-16 22:19<br/>
 *
 * @author JingShuai
 */
@Slf4j
@Component
public class PostgresqlDataSource implements DataSource {

  private static final String TYPE = "postgres";

  @Override
  public void registerDataSource() {
    log.info("注册{}数据源成功~", TYPE);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    DataSourcePool.addDataSource(TYPE, this);
  }
}
