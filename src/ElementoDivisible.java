
public class ElementoDivisible extends Elemento{
	
    final String MARCA = "(D)";
    
	public ElementoDivisible(float valor) {
		super(valor);
	}
	
	public void operar(Elemento nuevoED) {
		this.setValor( this.valor / nuevoED.getValor() );	
	}
	
	public String toString() {
		return Float.toString(valor) + " " + this.MARCA;
	}
}
