
public class ElementoRestable extends Elemento{

	//float valor = 0;
	private float eR = 0;
	
	public ElementoRestable(float eR) {
		this.eR = eR;
	}
	
	public void resta(ElementoRestable nuevoER) {
		this.set_eR( this.eR - nuevoER.get_eR() );
	}
	
	public float get_eR() {
		return this.eR;
	}
	
	public void set_eR(float nuevoValorR) {
		this.eR = nuevoValorR;
	}
}
