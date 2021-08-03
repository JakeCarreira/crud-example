package br.com.crud.service;

import org.springframework.http.ResponseEntity;

import br.com.crud.dto.FindUserDTO;
import br.com.crud.dto.RestDTO;

public interface RestService {
	
	public ResponseEntity<?> getUser(FindUserDTO findUserDTO);
	public ResponseEntity<?> saveUser(RestDTO restDTO);
	public ResponseEntity<?> updateUser(RestDTO restDTO);
	public ResponseEntity<?> deleteUser(RestDTO restDTO);

}
