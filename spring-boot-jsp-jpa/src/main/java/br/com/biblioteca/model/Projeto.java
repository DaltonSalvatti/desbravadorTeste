package br.com.biblioteca.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Projeto {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany(targetEntity=Pessoa.class)
	private Set<Pessoa> pessoas;
	
	@Column(length=100, nullable=false)
	private String nome;
	
	private Date data_inicio;
	
	private Date data_previsao_fim;
	
	private Date data_fim;
	
	@Column(length=5000)
	private String descricao;
	
	@Column(length=45)
	private String status;
	
	private Float orcamento;

	@Column(length=45)
	private String risco;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idgerente")
	private Pessoa gerente;
	
	
}
