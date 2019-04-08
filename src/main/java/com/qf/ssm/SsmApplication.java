package com.qf.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//跟mybatis整合，要扫描mapper层，创建代理对象那个
@MapperScan(basePackages = "com.qf.ssm.mapper")
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
	}

}

