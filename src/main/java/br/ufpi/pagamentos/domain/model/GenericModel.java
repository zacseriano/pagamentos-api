package br.ufpi.pagamentos.domain.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class GenericModel {
	@Id
	@GeneratedValue
	private Long id;
	@CreationTimestamp
	private LocalDate dataCricao;
	@UpdateTimestamp
	private LocalDate dataAtualizacao;
}
