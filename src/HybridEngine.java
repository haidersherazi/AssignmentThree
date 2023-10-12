
public class HybridEngine extends Engine {
	
	
	private String fuelType;
    private int batteryCapacity; // in kilowatt-hours (kWh)
    
    public HybridEngine(String chassisNumber, int maxPower, String fuelType, int batteryCapacity) {
        super(chassisNumber, maxPower);
        this.fuelType = fuelType;
        this.batteryCapacity = batteryCapacity;
    }

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
    
    
}
