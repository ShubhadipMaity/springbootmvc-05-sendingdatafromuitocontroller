package in.shuba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.shuba.entity.Employee;


@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	static {
		System.out.println("Employee.class is loading...");
	}
	
	
	@GetMapping("/")
	public String homePage() {
		
		return"register";
	}
	
	@PostMapping("/reg")
	public String register(@ModelAttribute("employee") Employee employee,Model model) {
		System.out.println(employee);
		model.addAttribute("employee", employee);
		
		return "emp";
	}
	
	
}
