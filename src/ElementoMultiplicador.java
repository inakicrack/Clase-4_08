
public class ElementoMultiplicador extends Elemento{
	
	final String MARCA = "(M)";
	
	public ElementoMultiplicador(float valor) {
		super(valor);
	}


	public void operar(Elemento nuevoEM) {
		this.setValor( this.valor * nuevoEM.getValor() );
	}
	
	public String toString() {
		return Float.toString(valor) + " " + this.MARCA;
	}
}
