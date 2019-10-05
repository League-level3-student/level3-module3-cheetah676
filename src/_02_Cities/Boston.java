package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double total=population*growthRate*1.50;
		System.out.println(total);
		return total;
	}

}
