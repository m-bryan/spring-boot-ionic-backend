package com.bryan.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bryan.cursomc.domain.Cidade;
import com.bryan.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findCidades(Integer estadoId) {
		return repo.findCidades(estadoId);
	}

}
