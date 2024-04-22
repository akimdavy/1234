package lv.venta.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstController {

	@GetMapping("/hello") //localhost:8888/hello
	public String getHello() {
		System.out.println("The first controller is working!!!");
		return "hello-page";// it will show hello-page html file in the browser
	}
	Random rand = new Random();
	@GetMapping("/hello/msg")//localhost:8888/hello/msg
	public String getHellomsg(Model model) {
		System.out.println("The first controller is working!!!");
		model.addAttribute("mypackage", "Hello from JAVA");
		return "hello-msg-page";// it will show hello-page html file in the browser
	}
}
	//TODO
	//1. create git repo
