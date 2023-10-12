
public class CombustionEngine extends Engine  {

	private String fuelType;
	
	public CombustionEngine(String chasingNumber, int maxPower, String fuelType) {
        super(chasingNumber , maxPower);
        
        this.fuelType = fuelType;
    }

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
