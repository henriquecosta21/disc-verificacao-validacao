package verificacao_validacao;

public class FahrenheitCelciusConverter {
	
	public static double toFahrenheit(double temp) {
		double result = (temp * 1.8) + 32; 
		return (int) result;
	}
	
	public static double toCelcius(double temp) {
		double result = (temp - 32) / 1.8; 
		return (int) result;
	}
	
}
