
public class ElementoSumable extends Elemento{

	final String MARCA = "(S)";
	
	public ElementoSumable(float valor) {
		super(valor);
	}
	
	public void operar(Elemento nuevoES) {
		this.setValor( this.valor + nuevoES.getValor() );
	}
	
	public String toString() {
		return Float.toString(valor) + " " + this.MARCA;
	}
}
