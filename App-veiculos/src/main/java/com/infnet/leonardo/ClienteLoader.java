package com.infnet.leonardo;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.service.ClienteService;

@Order(1)
@Component
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("arquivos/usuario.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 
			
			Cliente cliente = new Cliente();
			cliente.setEmail(campos[0]);
			cliente.setNome(campos[1]);
			cliente.setSenha(campos[2]);

			clienteService.incluir(cliente);
			
			linha = leitura.readLine();
		}

		leitura.close();			
	}
}