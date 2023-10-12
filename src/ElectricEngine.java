
public class ElectricEngine extends Engine {
	
	private int batteryCapacity; // in kilowatt-hours (kWh)
	
	public ElectricEngine(String chassisNumber, int maxPower, int batteryCapacity) {
        super(chassisNumber, maxPower);
        this.batteryCapacity = batteryCapacity;
    }

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
