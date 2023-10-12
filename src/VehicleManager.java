
public class VehicleManager {

	public static void main (String[] args) {

		Car toyotaCar = new Car(1, "Toyota", "Venza", 2022, "Black", 62000, "ABC123");
        Car hondaCar = new Car(2, "Honda", "Civic", 2017, "Blue", 16000, "SFF163");
        Car kiaCar = new Car(3, "Kia", "Picanto", 2020, "White", 13000, "HGY567");
        
		Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture kia = new Manufacture("Kia", "Pakistan");
        Manufacture honda = new Manufacture("Honda", "Germany");

        Engine combustion = new CombustionEngine("HKJHKL48G23", 140, "Petrol");
        Engine electric = new ElectricEngine("QFVJKL48G81", 120, 60);
        Engine hybrid = new HybridEngine("LEDGTH27K90", 100, "Petrol", 40);
        
        Vehicle[] vehicles = {
            new ICEV(toyota, combustion, toyotaCar),
            new BEV(honda, electric, hondaCar),
            new HybridV(kia, hybrid, kiaCar)
        };

        for (int i = 0; i < vehicles.length; i ++) {
            vehicles[i].showCharacteristics();
        }
        
	}

}
