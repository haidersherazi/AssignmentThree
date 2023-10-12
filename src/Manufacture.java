
public class Manufacture {
	private String name;
    private String manufactureCountry;
    
    public Manufacture() {
    	name = "";
    	manufactureCountry = "";
    }
    

	public Manufacture(String name, String manufactureCountry) {
		super();
		this.name = name;
		this.manufactureCountry = manufactureCountry;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getManufactureCountry() {
		return manufactureCountry;
	}


	public void setManufactureCountry(String manufactureCountry) {
		this.manufactureCountry = manufactureCountry;
	}

}
