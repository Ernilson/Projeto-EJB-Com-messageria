package br.com.projeto.controllerBens;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.projeto.model.Pessoa;
import br.com.projeto.service.PessoaService;

@Named
@RequestScoped
public class PessoaBeans implements Serializable {

	private static final long serialVersionUID = 1L;

	private PessoaService ps;
	Pessoa pessoa = new Pessoa();
	
	public String gravar() {
		pessoa.setNome("teste");
		ps.create(pessoa);
		return "";
	}
}
