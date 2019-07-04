package com.shenpotato;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.shenpotato.mapper")
@SpringBootApplication
public class MyresumewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyresumewebApplication.class, args);
	}

}
