package Entidades;

// Importações de Bibliotecas
import java.util.Date;

public class Projeto {
    // Atributos
    private String id;
	private String nome;
	private Date data_de_inicio;
	private Date data_de_termino;
	private String responsavel;
	private String descricao;

	public Projeto(String id, String nome, Date data_de_inicio, Date data_de_termino, String responsavel,
			String descricao) {
        // Construtor
		this.id = id;
		this.nome = nome;
		this.data_de_inicio = data_de_inicio;
		this.data_de_termino = data_de_termino;
		this.responsavel = responsavel;
		this.descricao = descricao;
	}

    // Métodos Getters
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

    // Métodos Setters
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
