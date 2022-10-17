package cn.com.kun.springsdk.config;//package com.kun.kunwebdemo.config.springTester;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "cn.com.kun.springsdk")
public class JpaScanConifg {


}
