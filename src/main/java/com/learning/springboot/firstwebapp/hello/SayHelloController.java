package com.learning.springboot.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {
	
	@GetMapping("/say-hello-html")
	@ResponseBody
	public String sayHellohtml() {
		String html = "<html><head><title>My ToDo App</title></head><body>This is my first WebApp</body></html>";
		return html;
	}
	
	@GetMapping("/say-hellohtml")
	@ResponseBody
	public String sayHello1() {
		String html = """
				<html>
	<head>
		<title>My ToDo App</title>
	</head>
	<body>
		This is my first WebApp test
	</body>
</html>
				""";
		return html;
	}
	
	@GetMapping("/say-hello")
//	@ResponseBody
	public String sayHello() {
		return "sayhello";
	}
	
	
	

}
