
public class ElementoSumable extends Elemento{

	//float valor = 0;
	private float eS = 0;
	
	public ElementoSumable(float eS) {
		this.eS = eS;
	}
	
	public void suma(ElementoSumable nuevoES) {
		this.set_eS( this.eS + nuevoES.get_eS() );
	}
	
	public float get_eS() {
		return this.eS;
	}
	
	public void set_eS(float nuevoValorS) {
		this.eS = nuevoValorS;
	}
}
