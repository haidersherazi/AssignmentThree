
public class BEV extends Vehicle {
	
	public BEV(Manufacture manufacture , Engine engine , Car car) {
		super(manufacture , engine , car);
    
	}

    @Override
    
    public void showCharacteristics() {
        
    	System.out.println("Characteristics of BEV Car: \n"
    			+ "Make : " + this.getManufacture().getName()
    			+ "\nModel : " + this.getCar().getModel()
    			+ "\nCar Color : " + this.getCar().getColor()
    			+ "\nEngine Chassis Number : " + this.getEngine().getChassisNumber()
    			+ "\nEngine Max Power : " + this.getEngine().getMaxPower() + " kW"
    			+ "\nManufacturer Country : " + this.getManufacture().getManufactureCountry() + "\n");
    
    }
}
