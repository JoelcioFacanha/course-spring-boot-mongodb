package com.treinamento.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.workshopmongo.domain.User;
import com.treinamento.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> finAll() {
		return repository.findAll();
	}

}
