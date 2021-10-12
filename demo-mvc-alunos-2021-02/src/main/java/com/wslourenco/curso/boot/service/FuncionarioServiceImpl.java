package com.wslourenco.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wslourenco.curso.boot.dao.FuncionarioDao;
import com.wslourenco.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly=true)
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	private FuncionarioDao dao;
	
	@Override
	@Transactional(readOnly=false)
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
	}

	@Override
	@Transactional(readOnly=false)
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
	}

	@Override
	@Transactional(readOnly=false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public void buscarPorId(Long id) {
		dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

}
