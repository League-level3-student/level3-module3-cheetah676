package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double bonus=growthRate/2;
		double taxes=population*growthRate;
		double taxesTimesBonus=taxes*bonus;
		System.out.println(taxesTimesBonus);
		return taxesTimesBonus;
	}
	
}
