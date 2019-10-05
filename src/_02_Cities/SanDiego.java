package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double startTax=1000000;
		double taxes=population*growthRate;
		double totalTax=startTax+taxes;
		System.out.println(totalTax);
		return totalTax;
	}
}
