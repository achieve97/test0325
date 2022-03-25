package Java0224_3;

public class iPhone extends SmartPhone {

	@Override
	int getPrice() {
		int price = 120;
		return price;
	}

	@Override
	String getBrand() {
		String brand = "Samsung";
		return brand;
	}

	@Override
	String getModel() {
		String model = "Galaxy22";
		return model;
	}

}

