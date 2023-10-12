
public class HybridV extends Vehicle {
	
	public HybridV(Manufacture manufacture , Engine engine, Car car) {
    
		super(manufacture , engine , car);
    }

    @Override
    
    public void showCharacteristics() {
        
    	System.out.println("Characteristics of HybridV Car: \n"
    			+ "Make : " + this.getManufacture().getName()
    			+ "\nModel : " + this.getCar().getModel()
    			+ "\nCar Color : " + this.getCar().getColor()
    			+ "\nEngine Chassis Number : " + this.getEngine().getChassisNumber()
    			+ "\nEngine Max Power : " + this.getEngine().getMaxPower() + " kW"
    			+ "\nManufacturer Country : " + this.getManufacture().getManufactureCountry() + "\n");
    	
    }
}
