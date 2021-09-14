package br.com.projeto.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.projeto.dao.PessoaDAO;
import br.com.projeto.model.Pessoa;

@Stateless
public class PessoaService {

	@EJB
	private PessoaDAO pr;
	
	public void create(Pessoa pessoa) {
		pr.persist(pessoa);
	}
}
