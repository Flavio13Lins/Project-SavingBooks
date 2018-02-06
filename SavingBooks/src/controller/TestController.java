package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("chamarTest1")
	public String test1(){
		System.out.println("Método ok!");
		return "teste2";
	}
}
