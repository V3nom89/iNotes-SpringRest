package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.contrader.dto.UserDTO;
import it.contrader.dao.UserRepository;
import it.contrader.dto.CandidatiDTO;
import it.contrader.dto.IterSelettivoDTO;
import it.contrader.service.IterSelettivoService;
import it.contrader.service.UserService;
import it.contrader.model.User.Usertype;


@Controller
@RequestMapping("/iterSelettivo")
@CrossOrigin(origins = "http://localhost:4200")
public class IterSelettivoController extends AbstractController<IterSelettivoDTO> {

	@Autowired
	private IterSelettivoService service;

}
	