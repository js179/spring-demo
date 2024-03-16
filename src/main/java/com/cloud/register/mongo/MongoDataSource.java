package com.cloud.register.mongo;

import com.cloud.register.DataSource;
import com.cloud.register.DataSourcePool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.register.mongo<br/>
 * 类名称: MongoDataSource<br/>
 * 类描述: mongo数据源<br/>
 * 创建时间: 2024-03-16 22:16<br/>
 *
 * @author JingShuai
 */
@Slf4j
@Component
public class MongoDataSource implements DataSource {

  private static final String TYPE = "mongo";

  @Override
  public void registerDataSource() {
    log.info("注册{}数据源成功~", TYPE);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    DataSourcePool.addDataSource(TYPE, this);
  }
}
