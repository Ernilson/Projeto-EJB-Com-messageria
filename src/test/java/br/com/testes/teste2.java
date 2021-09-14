package br.com.testes;

import br.com.projeto.dao.PessoaDAO;
import br.com.projeto.model.Pessoa;
import br.com.projeto.service.PessoaService;

public class teste2 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		PessoaDAO dao = new PessoaDAO();
		PessoaService service = new PessoaService();
		try {
			p.setNome("teste");
			dao.persist(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
