package br.ufpi.pagamentos.domain.model;

import java.time.LocalDate;

import br.ufpi.pagamentos.domain.enuns.SituacaoEnum;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cartao extends GenericModel{
	private String numero;
	private String codigoVerificacao;
	private LocalDate validade;
	private SituacaoEnum situacao;
}
