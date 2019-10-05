package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double newGrowthRate=growthRate*2;
		double taxes=population*newGrowthRate;
		System.out.println(taxes);
		return taxes;
	}

}
