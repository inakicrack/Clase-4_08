import MisExcepciones.DetectadoValorNegativoException;

public class ElementoRestable extends Elemento{
	
	final String MARCA = "(R)";
	
	public ElementoRestable(float valor) {
		super(valor);
		//this.checkValor();
	}
	
	public void operar(Elemento nuevoER) { //throws DetectadoValorNegativoException {
		this.setValor( this.valor - nuevoER.getValor() );
	}
	
	public String toString() {
		return Float.toString(valor) + " " + this.MARCA;
	}
	
	public void setValor(float nuevoValor) { //throws DetectadoValorNegativoException {
		this.valor = nuevoValor;
		this.checkValor();
		/*
		try {
			this.checkValor();
		} catch (DetectadoValorNegativoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//this.setValor(this.getValor() * -1);
			//throw new DetectadoValorNegativoException("Error anidado");
		}
		*/
	} 
	
	private void checkValor() { //throws  DetectadoValorNegativoException{
		if (this.valor < 0) {
			throw new DetectadoValorNegativoException("\nHAS PEUSTO UN VALOR NEGATIVO EN LA OPERACIÓN !!!\n");
		}
	}
}
