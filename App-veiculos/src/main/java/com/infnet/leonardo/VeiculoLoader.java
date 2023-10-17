package com.infnet.leonardo;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.infnet.leonardo.model.domain.Carro;
import com.infnet.leonardo.model.domain.Cliente;
import com.infnet.leonardo.model.domain.Moto;
import com.infnet.leonardo.model.domain.Van;
import com.infnet.leonardo.model.service.VeiculoService;

@Order(3)
@Component
public class VeiculoLoader implements ApplicationRunner {
	
	@Autowired
	private VeiculoService veiculoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/veiculo.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 
			
			switch (campos[6]) {
			case "M":
				Moto moto = new Moto(
						campos[0], 
						Float.valueOf(campos[1]), 
						Integer.valueOf(campos[2]), 
						Integer.valueOf(campos[3]), 
						campos[4]
				);	
				
				moto.setUsuario(new Cliente(Integer.valueOf(campos[5])));

				veiculoService.incluir(moto);				
				break;

			case "C":
				Carro carro = new Carro(
						campos[0], 
						Float.valueOf(campos[1]), 
						Integer.valueOf(campos[2]), 
						Integer.valueOf(campos[3]), 
						Integer.valueOf(campos[4])
					);
				
				carro.setUsuario(new Cliente(Integer.valueOf(campos[5])));

				veiculoService.incluir(carro);
				break;

			case "V":
				Van van = new Van(
						campos[0], 
						Float.valueOf(campos[1]), 
						Integer.valueOf(campos[2]), 
						Boolean.valueOf(campos[3]), 
						campos[4]
					);
				
				van.setUsuario(new Cliente(Integer.valueOf(campos[5])));

				veiculoService.incluir(van);
				break;
			
			default:
				break;
			}
			
			linha = leitura.readLine();
		}

		leitura.close();		
	}
}