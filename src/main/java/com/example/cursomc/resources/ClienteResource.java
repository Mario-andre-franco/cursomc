package com.example.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes") // end point
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // OBTENDO DADO
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj); // resposta tera como corpo, o obj que foi buscado no banco de dados

	}

}
