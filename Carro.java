
public class Carro extends Veiculo{
	
	private String modelo;
	private String cor;
	
	public Veiculo() {
		super();
		this.modelo = "";
		this.cor = "";
		}
	public Veiculo() {
		super(placa);
		this.modelo=modelo;
		this.cor=cor;
	}
	public boolean equals(Object obj) {
	    if ( !super.equals(obj) )
	        return false;
		
		if(obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Carro other = (Carro) obj;
		
		if (this.modelo == null) {
			if(other.modelo != null)
				return false;
		}
		else if(! this.modelo.equals(other.modelo))
			return false;
		
		if (this.cor == null) {
			if(other.cor != null)
				return false;
		}
		else if(! this.cor.equals(other.cor))
			return false;
		return true;
	}
	
	public int hashCode() {
		int primo = 31;
		int total = super.hashCode();
		return total = primo * total + (modelo == null ? 0 : modelo.hashCode());
		return total = primo * total + (cor == null ? 0 : cor.hashCode();)
	}
	
	public String toString() {
		return super.toString() + "Carro [modelo: " + this.modelo + ", cor: " + this.cor + "]";
	}
}

}
