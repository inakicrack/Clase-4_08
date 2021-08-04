//import MisExcepciones.DetectadoValorNegativoException;

abstract public class Elemento {

	float valor = 0;
	
	public Elemento(float valor) {
		this.valor = valor;
	}
	
	/*public void operar(Elemento otroElemento) {
		this.setValor(otroElemento.getValor());
	}
	*/
	
	abstract public void operar(Elemento otroElemento); //throws DetectadoValorNegativoException;

	/*
	Este toString() está definido para enseñar a usar "instanceof" 
	Solo usar para toString() que sean sencillos
	*/
	public String toString() {
		
		String marca = "";
		
		if (this instanceof ElementoDivisible) {
			marca = "(D)*";
		}
		
		if (this instanceof ElementoMultiplicador) {
			marca = "(M)*";
		}
		
		if (this instanceof ElementoRestable) {
			marca = "(R)*";
		}
		
		if (this instanceof ElementoSumable) {
			marca = "(S)*";	
		}
		return Float.toString(valor) + " " + marca;	
	}
	
	
	public float getValor() {
		return this.valor;
	}
	
	public void setValor(float nuevoValor) { //throws DetectadoValorNegativoException{
		this.valor = nuevoValor;
	} 
}
