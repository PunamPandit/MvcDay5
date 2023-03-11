package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping({"/login", ""})
	public String showLoginPage() {
		return "login";
	}
	
		
	
	@PostMapping("login")
	public String authenticateExp(@RequestParam String emailId,@RequestParam String password, Model model) {
		       EmployeeDTO employeeDTO=employeeService.authenticate(emailId,password);
		if(employeeDTO!=null) {
			System.out.println("data is available");
			model.addAttribute("employeeDTO",employeeDTO);
			return "showEmployee";	
		}else {
			System.out.println("Data is not available");
			model.addAttribute("msg", "Re-Try");
			return "login";
		}
	}
	
	@GetMapping("/showEmployee2")   
	public String getAllEmployee(Model model) {
		List<EmployeeDTO> employeeDTO=employeeService.getAllEmployee();
		
		System.out.println("List of employee  ="+employeeDTO.size());//data will show in number
		model.addAttribute("employeeDTO",employeeDTO);
		return "showEmployee2";   //abc.jsp
		

	}
	
	@GetMapping("/employeeRegistration")
	public String showHeyPage() {
		return "registration";
	}
		
		@PostMapping("/registration")
		public String employeeRegistration(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		// @ModelAttribute used for holding all attributes value at a single moment .
			//no need to write 5 times 
			String message = employeeService.saveEmployee(employeeDTO);
			model.addAttribute("message",message);
			return "insertSucess";
		}
		@GetMapping("/updatePage")
		public String showUpdatePage() {
			return "update";
		}	
			@GetMapping("/deletePage")
			public String showdeletePage(@RequestParam int employeeId,Model model) {
				employeeService.deleteEmployee(employeeId);
				//model.addAttribute("delete","Record deleted successfully");
				return "redirect:/showEmployee2";
			}

}
