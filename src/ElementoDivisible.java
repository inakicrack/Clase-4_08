
public class ElementoDivisible extends Elemento{

	//float valor = 0;
	private float eD = 0;
	
	public ElementoDivisible(float eD) {
		this.eD = eD;
	}
	
	public void division(ElementoDivisible nuevoED) {
		this.set_eD( this.eD / nuevoED.get_eD() );	
	}
	
	public float get_eD() {
		return this.eD;
	}
	
	public void set_eD(float nuevoValorD) {
		this.eD = nuevoValorD;
	}
	
}
