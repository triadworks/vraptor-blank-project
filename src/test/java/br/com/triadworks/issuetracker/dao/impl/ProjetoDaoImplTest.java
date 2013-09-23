package br.com.triadworks.issuetracker.dao.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import base.SpringIntegrationTestCase;
import br.com.triadworks.dbunit.dataset.ClassEntryDataSetSource;
import br.com.triadworks.issuetracker.dao.ProjetoDao;
import br.com.triadworks.issuetracker.model.Projeto;

public class ProjetoDaoImplTest extends SpringIntegrationTestCase {
	
	@Autowired
	private ProjetoDao dao;
	
	@Before
	public void setup() {
		dbUnitManager.cleanAndInsert(new ClassEntryDataSetSource(ProjetoDaoImplTest.class));
	}

	@Test
	public void deveInserirNovoProjeto() {
		
		Projeto novoProjeto = new Projeto();
		novoProjeto.setNome("NOVO PROJETO");
		
		dao.salva(novoProjeto);
		
		Projeto projetoDoBanco = dao.carrega(novoProjeto.getId());
		assertEquals("nome", novoProjeto.getNome(), projetoDoBanco.getNome());
	}
	
	@Test
	public void deveEncontrarProjetoPorId() {
		
		Projeto projeto = dao.carrega(-1L);
		
		assertEquals("id", -1L, projeto.getId().longValue());
		assertEquals("nome", "ADMIN", projeto.getNome());
	}
	
	@Test
	public void deveListarTodosOsProjetos() {
		
		List<Projeto> projetos = dao.listaTudo();
		
		assertEquals("total de projetos", 3, projetos.size());
	}

}
