package com.siege;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/** @author siege */
@SpringBootApplication
@MapperScan("com.siege.mapper")
public class Application  {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }


  @Bean
  public TomcatServletWebServerFactory servletContainer() {
    return new TomcatServletWebServerFactory(8081);
  }
}
