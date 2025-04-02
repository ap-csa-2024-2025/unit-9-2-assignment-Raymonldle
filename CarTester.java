public class CarTester
{
	public static void run()
	{

		Car c = new Car("Toyota", 80);

		System.out.println(c.getModel());
		System.out.println(c.getFuelLevel());
		System.out.println(c.milesLeft());

		System.out.println(c.getModel(c));

		ElectricCar ec = new ElectricCar("Toyota", 80);

		System.out.println(ec.getModel());
		System.out.println(ec.getFuelLevel());
		System.out.println(ec.milesLeft(400));

		System.out.println(ec);
		// Create a Car object

		// Print out the model

		// Print out the fuelLevel

		// Print how many miles are left with 23 mpg

		// Print the object

		// Create an ElectricCar object

		// Print out the model

		// Print out the fuelLevel

		// Print how many miles are left with 400 miles per charge

		// Print the object
	}
}
