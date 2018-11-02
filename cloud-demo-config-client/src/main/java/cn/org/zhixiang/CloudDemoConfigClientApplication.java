package cn.org.zhixiang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class CloudDemoConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoConfigClientApplication.class, args);
	}

	@Value("${name}")
     String name;
	@Value("${age}")
	 String age;
	@RequestMapping(value = "/test")
	public String test() {
		return "我的名字是：" + name + ",年龄是" + age;
	}
}
