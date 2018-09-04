package br.com.db1.model;

import java.util.List;

import javax.persistence.Query;

import org.junit.Test;

public class CidadeTeste extends AbstractTest{

	@Test
	public void updateTest(){
		Query q = manager.createQuery("from uf where nome = :pNome");
		q.setParameter("pNome", "PR");
		q.setMaxResults(1);
		Uf uf = (Uf) q.getSingleResult();
				
		Cidade cidade = new Cidade();
		cidade.setNome('RR')
		cidade.setUf(uf);
		
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();
	}
	
	@Test
	public void selectTest(){
		Query q = manager.createQuery("from cidade");
		List<Cidade> cidades = q.GetResultList();
		
		for(Cidade cidade:cidades){
			System.out.println(cidade);
		}
	}
	
}
