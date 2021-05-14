/**
  * The CellPhone class holds data about a cellphone 
**/

public class CellPhone {
	
	// Fields
	private String manufact;	// Manufacture
	private String model;		// Model
	double retailPrice;			// Retail price

	/**
	  * Constructor
	  * @param man, the phone's manufacture
	  * @param mod, The phone's model
	  * @param price, The phone's retail price
	**/
	public CellPhone(String man, String mod, double price) {
		manufact = man;
		model = mod;
		retailPrice = price;
	}

	/**
	  * The setManufact method sets the phones manufacture name
	  *@param man,  The phone's manufacture
	**/
	public  void setManufact(String man) {
		manufact = man;
	}

	/**
	  * public void setModel
	  * @param mod, The phone's model
	**/
	public void setModel(String mod) {
		model = mod;
	}

	/**
	  * the setRetailPrice
	  * @param price, The phone's retail price
	**/
	public void setRetailPrice(double price) {
		retailPrice = price;
	}

	/**
	  * The getManufact method
	  * @return, The phone's manufacture
	**/
	public String getManufact() {
		return manufact;
	}

	/**
	  * The getModel method
	  * @return, The phone's model
	**/
	public String getModel() {
		return model;
	}

	/**
	  * The getRetailPrice method
	  * @return, The phone's retail price
	**/
	public double getRetailPrice() {
		return retailPrice;
	}

}
	   
	   
