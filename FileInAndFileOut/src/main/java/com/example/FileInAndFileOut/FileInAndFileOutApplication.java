package com.example.FileInAndFileOut;

import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileInAndFileOutApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileInAndFileOutApplication.class, args);
		System.out.println("启动成功");
	}

}
