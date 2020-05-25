package com.uca.capas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

	
	@GetMapping("/agregarUsuario")
	public String enviarForm(Usuario usuario) {
		return "agregarUsuario";
	}
	
	@PostMapping("/agregarUsuario")
	public String procesarForm(Usuario usuario) {
		return "mostrarMensaje";
	}
	
	
	
		
}
