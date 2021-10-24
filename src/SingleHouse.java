
public class SingleHouse extends HouseItem{

	String houseno;
	String address;
	String city;
	String streetno; 
	String zipcode;
	
	public SingleHouse(String houseno, String address, String city, String streetno, String zipcode) {
		this.houseno = houseno;
		this.address = address;
		this.city = city;
		this.streetno = streetno;
		this.zipcode = zipcode;
	}
	public String getHouseno() {
		return houseno;
	}

	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreetno() {
		return streetno;
	}
	
	public String getZipcode() {
		return zipcode;
	}

    public String toString(){
	      return ("Houseno : "+  getHouseno() 
	      +", city : "+ getCity() + ", streetno :"
	      + getStreetno()+", Zipcode :"+ getZipcode());
	   }   
}
