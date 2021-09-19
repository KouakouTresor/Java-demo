package com.example.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String sayHello() 
	{
		return "<h1>Hello Java</h1>";		
	};

	@RequestMapping("/proper")
	public String sayProperHello(){
		return "<h2>Say proper Hello</h2>";
	}

	@RequestMapping("/form")
	public String userGreeting(){
	return "<form action='/greeting/user_submitting' method='POST'><input type='text' name='secondname'>Name</input><input type='text' name='firstname'>Surname</input><input type='submit' value='submit'></input></form>";

	}

	@RequestMapping(value="/user_submitting", method=RequestMethod.POST)
	public String submittingForm(@RequestParam String firstname, @RequestParam String secondname){
		return "Hello there " + firstname + " " + secondname; 
	}


}
