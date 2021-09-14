package br.com.projeto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.projeto.model.Pessoa;


@Stateless
public class PessoaDAO {
	
	@PersistenceContext
	private EntityManager em;
		
	public void persist(Pessoa p) {
		em.persist(p);
	}
}
