package com.example.FileInAndFileOut;

import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //开启调度任务
public class FileInAndFileOutApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileInAndFileOutApplication.class, args);
		System.out.println("启动成功");
	}

}
