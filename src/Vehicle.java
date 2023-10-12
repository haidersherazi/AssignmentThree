
public abstract class Vehicle {
	
	private Manufacture manufacture;
    private Engine engine;
    private Car car;

    public Vehicle(Manufacture manufacture, Engine engine, Car car) {
        this.manufacture = manufacture;
        this.engine = engine;
        this.car = car;
    }
    
    public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Manufacture getManufacture() {
		return manufacture;
	}

	public void setManufacture(Manufacture manufacture) {
		this.manufacture = manufacture;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

    public abstract void showCharacteristics();
}
