package br.com.crud.repository;

import org.springframework.data.repository.Repository;

import br.com.crud.entity.RestEntity;

@org.springframework.stereotype.Repository
public interface RestRepository extends Repository<RestEntity, Long> {

	RestEntity findByEmail(String email);

	void save(RestEntity saveUser);

	RestEntity deleteByEmail(String email);

	void delete(RestEntity getUser);

}
