package com.tagworking.financas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tagworking.financas.model.entity.Usuario;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void existeEmail() {
		
		// CENARIO
		// CRIANDO O USUARIO E SALVANDO NA BASE DE DADOS
		Usuario usuario = Usuario.builder().nome("usuario").email("usuario@gmail.com").build();
		repository.save(usuario);
		
		// ACAO/EXECUCAO
		boolean result = repository.existsByEmail("usuario@gmail.com");
		
		// VERIFICACAO
		// VERIFICA SE O USUARIO EXISTE NA BASE DE DADOS
		Assertions.assertThat(result).isTrue();
		
		
	}

}
