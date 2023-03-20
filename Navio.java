//Escreva o código fonte da classe Navio com os atributos nome (String) e funciomento (LocalDate), 3 metodos construtores, 
//métodos get/get, método equals da classe Object,  método hashcode da classe Object e o método toString da classe Object;

import java.time.LocalDate;
public class Navio {
	
	private String nome;
	private LocalDate funcionamento;
	
	public Navio() {
		this.nome = "";
		this.funcionamento = LocalDate.now();
	}
	public Navio(String nome, Integer dia, Integer mes, Integer ano){
		this.nome = nome;
		this.funcionamento = LocalDate.of(dia, mes, ano);
	}
	public Navio(String nome) {
		this.nome = nome;
		this.funcionamento = LocalDate.now();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getFuncionamento() {
		return funcionamento;
	}
	public void setFuncionamento(LocalDate funcionamento) {
		this.funcionamento = funcionamento;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Navio other = (Navio) obj;
		
		if (this.nome == null) {
			if(other.nome != null)
				return false;
		}
		else if(! this.nome.equals(other.nome))
			return false;
		
		if (this.funcionamento == null) {
			if(other.funcionamento != null)
				return false;
		}
		else if(! this.funcionamento.equals(other.funcionamento))
			return false;
		return true;
	}
	
	public int hashCode() {
		int primo = 7;
		int total = 1;
		total = primo * total + (nome == null ? 0 : nome.hashCode());
		total = primo * total + (funcionamento == null ? 0 : funcionamento.hashCode());
		return total;
	}
	
	public String toString() {
		return "Navio [nome: " + this.nome + ", funcionamento: " + this.funcionamento + " ]";
	}

}
