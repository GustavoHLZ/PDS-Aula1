package Model;

public class ConversaoTemperatura {
	
	public float converterFtoC(float F) {
		float TempConvertida = (F-32f)*5f/9f;
		return TempConvertida;
	}

}
