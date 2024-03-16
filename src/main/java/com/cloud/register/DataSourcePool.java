package com.cloud.register;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 包名称: com.cloud.register<br/>
 * 类名称: DataSourcePool<br/>
 * 类描述: 数据源类型池<br/>
 * 创建时间: 2024-03-16 21:58<br/>
 *
 * @author JingShuai
 */
@Component
public class DataSourcePool {

  private static final Map<String, DataSource> dataSourceRegisterMap = new HashMap<>(8);

  public static void addDataSource(String type, DataSource dataSource) {
    dataSourceRegisterMap.put(type, dataSource);
  }

  public List<String> getDataSourceTypeList() {
    return dataSourceRegisterMap.keySet()
            .stream()
            .toList();
  }

  public DataSource getDataSource(String type) {
    return dataSourceRegisterMap.get(type);
  }
}
