package Model;

public class Retangulo {
	
	public float Calculaperimetro(Float A, Float B) {
		float resultadoperimetro = 2 * (A + B);
		return resultadoperimetro;
	}

	public float CalculaArea (Float A, Float B ) {
		float resultadoarea = B * A;
		return resultadoarea;
	}
}
