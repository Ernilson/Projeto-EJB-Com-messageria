package br.com.testes;

import javax.ejb.EJB;

import org.junit.jupiter.api.Test;

import br.com.projeto.model.Pessoa;
import br.com.projeto.service.PessoaService;


public class teste {

	@EJB
	private PessoaService service;	
	
	@Test
	public void test() {
		Pessoa p = new Pessoa();
		try {
			p.setNome("teste");
			service.create(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
