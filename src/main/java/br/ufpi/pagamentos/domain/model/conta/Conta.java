package br.ufpi.pagamentos.domain.model.conta;

import java.math.BigDecimal;
import java.util.List;

import br.ufpi.pagamentos.domain.enuns.SituacaoEnum;
import br.ufpi.pagamentos.domain.model.GenericModel;
import br.ufpi.pagamentos.domain.model.formaPagamento.FormaPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
	@OneToMany(mappedBy = "conta_id")
	private List<FormaPagamento> formasPagamento;
}
