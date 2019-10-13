package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double total=population*growthRate+population*.5;
		System.out.println(total);
		return total;
	}

}
