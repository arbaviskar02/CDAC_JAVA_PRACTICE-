
public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInIndianRupees) {
		float amountInPounds = amountInIndianRupees /POUND_TO_RUPEE;
		return amountInPounds;
	}

}
