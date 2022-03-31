package com.github.andylke.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoConfigServer {

  public static final void main(final String[] args) {
    SpringApplication.run(DemoConfigServer.class, args);
  }
}
