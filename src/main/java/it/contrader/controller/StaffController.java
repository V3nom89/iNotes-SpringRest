package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.IterSelettivoDTO;
import it.contrader.dto.StaffDTO;
import it.contrader.service.StaffService;


@Controller
@RequestMapping("/staff")
@CrossOrigin(origins = "http://localhost:4200")
public class StaffController extends AbstractController<StaffDTO>  {

	@Autowired
	private StaffService service;

}	
	