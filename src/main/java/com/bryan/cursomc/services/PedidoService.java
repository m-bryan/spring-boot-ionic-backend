package com.bryan.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bryan.cursomc.domain.Pedido;
import com.bryan.cursomc.repositories.PedidoRepository;
import com.bryan.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);

		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. ID: " + id + ", Tipo: " + Pedido.class);
		}
		return obj;
	}

}
