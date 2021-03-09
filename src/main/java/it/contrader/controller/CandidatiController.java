package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.CandidatiDTO;

import it.contrader.service.CandidatiService;


@Controller
@RequestMapping("/candidati")
@CrossOrigin(origins = "http://localhost:4200")
public class CandidatiController extends AbstractController<CandidatiDTO>{


	@Autowired
	private CandidatiService candidatiService;
}