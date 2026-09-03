
public class DollarToRupeeConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInUsDollars) {
		float amountInIndianRupees = amountInUsDollars * DOLLAR_TO_RUPEE;
		return amountInIndianRupees;
	}
	
	
	
}
