package br.com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.crud.dto.FindUserDTO;
import br.com.crud.dto.RestDTO;
import br.com.crud.service.RestService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rest")
public class RestController {
	
	@Autowired RestService restServer;
	
	@GetMapping
	public ResponseEntity<?> getUser(@RequestBody FindUserDTO findUserDTO) {
		return restServer.getUser(findUserDTO);
	}
	
	@PostMapping
	public ResponseEntity<?> savetUser(@RequestBody RestDTO restDTO) {
		return restServer.saveUser(restDTO);
	}
	
	@PutMapping
	public ResponseEntity<?> updateUser(@RequestBody RestDTO restDTO) {
		return restServer.updateUser(restDTO); 
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteUser(@RequestBody RestDTO restDTO) {
		return restServer.deleteUser(restDTO);
	}

}
