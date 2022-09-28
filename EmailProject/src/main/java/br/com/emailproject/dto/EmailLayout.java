package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUABRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUABRA_DE_LINHA_UNICA = "<br>";
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Administador")
			.append(QUABRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito a senha do sistema")
			.append(QUABRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
			
		
		return new Email(destinatario, assunto, texto.toString());
	}
	
public Email montarEmailSecretario(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Secretario")
			.append(QUABRA_DE_LINHA_DUPLA);
		
		texto
			.append("Texto personalizado para secretario")
			.append(QUABRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
			
		
		return new Email(destinatario, assunto, texto.toString());
	}
		
		
	private String gerarAssinatura(StringBuilder texto) {
		return texto
			.append("Att.:")
			.append(QUABRA_DE_LINHA_UNICA)
			.append("Operador de Caixa")
			.append(QUABRA_DE_LINHA_DUPLA)
			.toString();
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático favor não responder esse e-mail").toString();
		
	}
}
