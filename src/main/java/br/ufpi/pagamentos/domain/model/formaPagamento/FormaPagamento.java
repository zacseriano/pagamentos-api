package br.ufpi.pagamentos.domain.model.formaPagamento;

import java.util.List;
import java.util.Set;

import br.ufpi.pagamentos.domain.enuns.MetodoPagamentoEnum;
import br.ufpi.pagamentos.domain.enuns.SituacaoEnum;
import br.ufpi.pagamentos.domain.model.GenericModel;
import br.ufpi.pagamentos.domain.model.conta.Conta;
import br.ufpi.pagamentos.domain.model.pagamento.Pagamento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class FormaPagamento extends GenericModel {
	@ManyToOne
	private Conta conta;
	@Enumerated(EnumType.STRING)
	private Set<MetodoPagamentoEnum> metodosPagamento;
	@Enumerated(EnumType.STRING)
	private SituacaoEnum situacao;
	@OneToMany(mappedBy = "conta_id")
	private List<Pagamento> pagamentos;
}
