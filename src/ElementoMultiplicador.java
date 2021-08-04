
public class ElementoMultiplicador extends Elemento{

	//float valor = 0;
	private float eM = 0;
	
	public ElementoMultiplicador(float eM) {
		this.eM = eM;
	}

	public void multiplicacion(ElementoMultiplicador nuevoEM) {
		this.set_eM( this.eM * nuevoEM.get_eM() );
	}
	
	public float get_eM() {
		return this.eM;
	}
	
	public void set_eM(float nuevoValorM) {
		this.eM = nuevoValorM;
	}
}
