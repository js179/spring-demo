package com.cloud.register.oracle;

import com.cloud.register.DataSource;
import com.cloud.register.DataSourcePool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 包名称: com.cloud.register.oracle<br/>
 * 类名称: OracleDataSource<br/>
 * 类描述: oracle数据源<br/>
 * 创建时间: 2024-03-16 22:17<br/>
 *
 * @author JingShuai
 */
@Slf4j
@Component
public class OracleDataSource implements DataSource {

  private static final String TYPE = "oracle";

  @Override
  public void registerDataSource() {
    log.info("注册{}数据源成功~", TYPE);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    DataSourcePool.addDataSource(TYPE, this);
  }
}
