package sukkiri;

public class KyotoCleaningShop implements CleaningService{
	String ownerName;
	String address;
	String phone;
	
	public Shirt washShirt(Shirt s){
		return s;
	}
	
	public Towel washTowel(Towel t) {
		return t;
	}
	
	public Coat washCoat(Coat c) {
		return c;
	}
}
