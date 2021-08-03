package br.com.crud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.crud.dto.FindUserDTO;
import br.com.crud.dto.RestDTO;
import br.com.crud.entity.RestEntity;
import br.com.crud.repository.RestRepository;
import br.com.crud.service.RestService;

@Service
public class RestServiceImpl implements RestService {

	@Autowired
	private RestRepository restRepository;

	@Override
	public ResponseEntity<?> getUser(FindUserDTO findUserDTO) {

		RestEntity getUser = this.restRepository.findByEmail(findUserDTO.getEmail());

		if (getUser == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

		RestDTO response = new RestDTO();
		response.setEmail(getUser.getEmail());
		response.setName(getUser.getName());
		response.setOld(getUser.getOld());

		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<?> saveUser(RestDTO restDTO) {

		if (restDTO == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

		RestEntity getUser = this.restRepository.findByEmail(restDTO.getEmail());

		if (getUser != null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

		RestEntity saveUser = new RestEntity();
		saveUser.setEmail(restDTO.getEmail());
		saveUser.setName(restDTO.getName());
		saveUser.setOld(restDTO.getOld());

		this.restRepository.save(saveUser);

		return ResponseEntity.ok(null);

	}

	@Override
	public ResponseEntity<?> updateUser(RestDTO restDTO) {

		RestEntity getUser = this.restRepository.findByEmail(restDTO.getEmail());

		if (getUser == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		getUser.setEmail(restDTO.getEmail());
		getUser.setOld(restDTO.getOld());

		this.restRepository.save(getUser);

		return ResponseEntity.ok(null);

	}

	@Override
	public ResponseEntity<?> deleteUser(RestDTO restDTO) {

		RestEntity getUser = this.restRepository.findByEmail(restDTO.getEmail());

		if (getUser == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

		restRepository.delete(getUser);

		return ResponseEntity.ok(null);
		
		}

}
