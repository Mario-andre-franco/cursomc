package com.example.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/categorias") //end point
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //OBTENDO DADO
	public String listar () {
		
		return "rest ok";
	}

}
