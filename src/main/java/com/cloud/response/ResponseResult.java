package com.cloud.response;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.Serial;
import java.io.Serializable;

/**
 * 包名称: com.cloud.response<br/>
 * 类名称: ResponseResult<br/>
 * 类描述: 请求结果<br/>
 * 创建时间: 2024-03-16 22:24<br/>
 *
 * @author JingShuai
 */
@Data
public class ResponseResult implements Serializable {

  @Serial
  private static final long serialVersionUID = 4926593909090172940L;

  private final Integer code;

  private final String msg;

  private final Object data;

  private ResponseResult(Integer code, String msg, Object data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public static ResponseResult ok(Object data) {
    return new ResponseResult(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
  }

  public static ResponseResult ok(String msg, Object data) {
    return new ResponseResult(HttpStatus.OK.value(), msg, data);
  }

  public static ResponseResult error(String msg) {
    RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
    if (attributes instanceof ServletRequestAttributes) {
      HttpServletResponse response = ((ServletRequestAttributes) attributes).getResponse();
      if (response != null) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
      }
    }
    return new ResponseResult(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
