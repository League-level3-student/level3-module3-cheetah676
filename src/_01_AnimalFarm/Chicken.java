package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cluck");
	}

	@Override
	public void canBeEatenInMinecraft(boolean food) {
		// TODO Auto-generated method stub
		if(food==true) {
			System.out.println("Delicious");
		}
	}

}
