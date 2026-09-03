
public class CurrancyConverterMain {

	public static void main(String[] args) {
		System.out.println("  Todays Forex rates: ");
		System.out.println("  USD to INR : " + CurrencyConverter.DOLLAR_TO_RUPEE);
		CurrencyConverter forex;
		forex = new DollarToRupeeConverter();
		float inr =forex.doConvert(1);
		System.out.println("  $5000 = Rs. "+ inr);
		System.out.println(" \n _________/.(-.-)./_________");
		System.out.println("|___________________________|\n");
		forex = new RupeeToPoundConverter();
		float pound = forex.doConvert(5076000);
		System.out.println("  RS.5076000 = GBP."+pound);
		
	}

}
