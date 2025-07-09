package br.ufpi.pagamentos.domain.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SituacaoEnum {
	ATIVA("Ativa"),
	INATIVA("Inativa"),
	SUSPENSA("Suspensa");
	
	private String descricao;
}
