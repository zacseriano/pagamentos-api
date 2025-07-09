package br.ufpi.pagamentos.domain.model;

import br.ufpi.pagamentos.domain.enuns.MetodoPagamentoEnum;
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
public class Pagamento extends GenericModel{
	private Long idCompra;
	private MetodoPagamentoEnum metodoPagamento;
	@ManyToOne
	private Conta conta;
}
