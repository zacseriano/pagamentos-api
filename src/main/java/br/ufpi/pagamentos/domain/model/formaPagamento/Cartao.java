package br.ufpi.pagamentos.domain.model.formaPagamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cartao extends FormaPagamento {
	private BigDecimal limite;
	private String numero;
	private String codigoVerificacao;
	private LocalDate validade;
}
