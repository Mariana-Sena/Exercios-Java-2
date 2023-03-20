
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro("ABCD-1234","toro","prata");
		Carro c2 = new Carro("DCBA-4321","ford k+","preto");
		Carro c3 = new Carro("ABCD-1234","WR-V","vinho");

		System.out.println( c1.hashCode() );
		System.out.println( c2.hashCode() );
		System.out.println( c3.hashCode() );
		
}
