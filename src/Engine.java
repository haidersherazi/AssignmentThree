
public class Engine {

	private String chassisNumber;
	private int maxPower; // in kilowatts (kW)

	public Engine(String chasingNumber, int maxPower) {
        this.chassisNumber = chasingNumber;
        this.maxPower = maxPower;
    }

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	
}
