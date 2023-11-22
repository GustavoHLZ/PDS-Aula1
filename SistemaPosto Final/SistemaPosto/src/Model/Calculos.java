package Model;

public class Calculos {
	
	public float Diesel,Comum,Aditivada,Etanol,FrascoPreco500,FrascoQuantidade500,FrascoPreco1l,FrascoQuantidade1l, TotalFrasco500, TotalFrasco1l, TotaldosFrascos, TotaldosCombustiveis; 
	public String ValorArmazena;
	
    public String CalculoOleo (float quantidade) {
		String Calculo =String.valueOf( Diesel*quantidade);
		TotaldosCombustiveis = Float.valueOf(Calculo);
		return Calculo;
		
    
    }
    public String CalculoGasC ( float quantidade) {
    	String Calculo = String.valueOf(Comum*quantidade);
    	TotaldosCombustiveis = Float.valueOf(Calculo);
		return Calculo;
    
    }
    public String CalculoGasA (float quantidade) {
		String Calculo = String.valueOf(Aditivada*quantidade);
		TotaldosCombustiveis = Float.valueOf(Calculo);
		return Calculo;
    
    }
    public String CalculoEtanol (float quantidade) {
		String Calculo = String.valueOf(Etanol*quantidade);
		TotaldosCombustiveis = Float.valueOf(Calculo);
		return Calculo;
    
    }
    
    public String ValorVista()
	{
		String Calculo=String.valueOf((TotaldosCombustiveis+TotaldosFrascos)-((TotaldosCombustiveis+TotaldosFrascos)*0.10));
		ValorArmazena = Calculo;
		return Calculo;
	}
	public String ValorPrazo()
	{
		
		String Calculo = String.valueOf((TotaldosCombustiveis+TotaldosFrascos));
		return Calculo;
	}
	public String Valor30()
	{
		String Calculo =String.valueOf((TotaldosCombustiveis+TotaldosFrascos)+((TotaldosCombustiveis+TotaldosFrascos)*0.10));
		return Calculo;
	}

    
    public String Frasco500ml()
	{
		String resultado = String.valueOf(FrascoPreco500*FrascoQuantidade500);
		TotalFrasco500 =Float.valueOf(resultado);
		return resultado;
	}
	public String Frasco1l ()
	{
		String resultado =String.valueOf(FrascoPreco1l*FrascoQuantidade1l);
		TotalFrasco1l = Float.valueOf(resultado);
		return resultado;
	}
	public String ValorTotalOleo() {
		
		String resultado =String.valueOf(TotalFrasco500+TotalFrasco1l);
		TotaldosFrascos=Float.valueOf(resultado);
		return resultado;
	}
  
}
    
	
    



