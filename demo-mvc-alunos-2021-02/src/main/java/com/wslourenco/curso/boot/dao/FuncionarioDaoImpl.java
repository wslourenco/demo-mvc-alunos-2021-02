package com.wslourenco.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.wslourenco.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
