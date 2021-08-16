package gerenciamento_de_projetos;

import java.util.Date;

public class Projeto {
	public String id;
	public String nome;
	public Date data_de_inicio;
	public Date data_de_termino;
	public String responsavel;
	public String descricao;
	
	public Projeto (String id, String nome, Date data_de_inicio, Date data_de_termino, String responsavel, String descricao) {
		this.id = id;
		this.nome = nome;
		this.data_de_inicio = data_de_inicio;
		this.data_de_termino = data_de_termino;
		this.responsavel = responsavel;
		this.descricao = descricao;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Date getData_de_inicio() {
		return this.data_de_inicio;
	}
	
	public Date getData_de_termino() {
		return this.data_de_termino;
	}
	
	public String getResponsavel() {
		return this.responsavel;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setData_de_inicio(Date data_de_inicio) {
		this.data_de_inicio = data_de_inicio;
	}
	
	public void setData_de_termino(Date data_de_termino) {
		this.data_de_termino = data_de_termino;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
