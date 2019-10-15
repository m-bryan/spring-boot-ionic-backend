package com.bryan.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bryan.cursomc.domain.Estado;
import com.bryan.cursomc.repositories.EstadoRepository;
import com.bryan.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;	

	public Estado find(Integer id) {
		Estado obj = repo.findOne(id);

		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. ID: " + id + ", Tipo: " + Estado.class);
		}
		return obj;
	}

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}

	public Page<Estado> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
}
