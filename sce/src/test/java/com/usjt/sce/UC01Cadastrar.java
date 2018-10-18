package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;

public class UC01Cadastrar {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro;
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	 public void CT03cadastrarLivroComISBN_em_branco(){
	 try{
	 // cenario
	 Livro livro;
	 //acao
	 livro = ObtemLivro.comISBNInvalido_branco();
	 fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
	 //verificacao
	 assertEquals("ISBN invalido", e.getMessage());
	 }
	 }
	@Test
	 public void CT04cadastrarLivroComDadosValidos(){
	 
	 // cenario
	 Livro umLivro;
	 //acao
	 umLivro = ObtemLivro.comDadosValidos();
	 
	 //verificacao
	 assertEquals("121212", umLivro.getIsbn());
	 
	 }
}
