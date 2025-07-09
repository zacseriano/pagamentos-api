package br.ufpi.pagamentos.domain.model;

import java.math.BigDecimal;
import java.util.List;

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
public class Conta extends GenericModel {
	private BigDecimal saldo;
	private Long idUsuario;
	private SituacaoEnum situacao;
	private List<Cartao> cartoes;
	private List<Pagamento> pagamentos;
}
