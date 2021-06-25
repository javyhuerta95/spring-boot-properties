package com.javyhuerta.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class DemoController {

	@Value("${prop.lenguaje}")
	private String lenguaje;
	
	@Value("${prop.framework}")
	private String framework;
	
	@Value("${prop.db}")
	private String bd;
	
	@GetMapping("/")
	public ResponseEntity<?> demo(){
		Map<String,Object> response = new HashMap<>();
		response.put("titulo", "Bienvenido al blog");
		response.put("descripcion", "Aprende a separar tu archivo de properties del proyecto");
		response.put("prop1", lenguaje);
		response.put("prop2", framework);
		response.put("prop3", bd);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}
}
