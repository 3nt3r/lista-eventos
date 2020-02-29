package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	@NotNull (message = "O campo está vazio!")
	@Size(min = 2, max = 50, message="Dados insuficientes!")
	private String nome;

	@NotNull (message = "O campo está vazio!")
	@Size(min = 2, max = 50, message="Dados insuficientes!")
	private String local;

	@NotNull (message = "O campo está vazio!")
	@Size(min = 2, max = 50, message="Dados insuficientes!")
	private String data;

	@NotNull (message = "O campo está vazio!")
	@Size(min = 2, max = 50, message="Dados insuficientes!")
	private String horario;

	@NotNull (message = "O campo está vazio!")
	@Size(min = 2, max = 50, message="Dados insuficientes!")
	private String responsavel;

	@OneToMany
	private List<Convidado> convidados;
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public List<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}

}
