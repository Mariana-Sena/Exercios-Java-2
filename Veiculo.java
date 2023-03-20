
public class Veiculo {
	
	private String placa;
	
	public Veiculo() {
		this.placa="";
	}
	
	public Veiculo(String placa) {
		this.placa=placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Veiculo other = (Veiculo) obj;
		
		if (this.placa == null) {
			if(other.placa != null)
				return false;
		}
		else if(! this.placa.equals(other.placa))
			return false;
		return true;
	}
	
	public int hashCode() {
		int primo = 31;
		int total = 1;
		return total = primo * total + (placa == null ? 0 : placa.hashCode());
	}
	
	public String toString() {
		return "Veiculo [placa: " + this.placa + " ]";
	}
	
}
