package com.lyscharlie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyscharlie.biz.mapper")
public class SpringbootMybatisplusDynamicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisplusDynamicApplication.class, args);
	}

}
