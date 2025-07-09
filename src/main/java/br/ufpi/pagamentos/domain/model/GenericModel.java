package br.ufpi.pagamentos.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericModel {
	@Id
	private Long id;
	private LocalDate dataCricao;
	private LocalDate dataAtualizacao;
}
