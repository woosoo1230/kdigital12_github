package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;

@SpringBootApplication //내장톰캣실행

@ComponentScan
@ComponentScan(basePackageClasses = EmpMybatisController.class)

@MapperScan(basePackageClasses = EmpDAO.class)

public class Kdigital12StsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kdigital12StsApplication.class, args);
	}

}
