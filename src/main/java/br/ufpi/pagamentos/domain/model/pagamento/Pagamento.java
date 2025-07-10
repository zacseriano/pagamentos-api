package br.ufpi.pagamentos.domain.model.pagamento;

import java.math.BigDecimal;

import br.ufpi.pagamentos.domain.enuns.MetodoPagamentoEnum;
import br.ufpi.pagamentos.domain.model.GenericModel;
import br.ufpi.pagamentos.domain.model.formaPagamento.FormaPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pagamento extends GenericModel {
	private Long idCompra;
	private BigDecimal valor;
	private MetodoPagamentoEnum metodoPagamento;
	@ManyToOne
	private FormaPagamento formaPagamento;
}
