package com.wslourenco.curso.boot.dao;

import java.util.List;

import com.wslourenco.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario Funcionario);
	
	void update(Funcionario Funcionario);

	void delete(Long id);

	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
}
