import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class House extends HouseItem{
	String houseno;
	String address;
	String city;
	String streetno; 
	String zipcode;
	private List<House> houses;

	ArrayList<HouseItem> houseComponent = new ArrayList<HouseItem>();

	public House(String houseno, String address, String city, String streetno, String zipcode) {
		this.houseno = houseno;
		this.address = address;
		this.city = city;
		this.streetno = streetno;
		this.zipcode = zipcode;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void add(HouseItem h) {
		houseComponent.add(h);
	   }

	   public void remove(HouseItem h) {
		   houseComponent.remove(h);
	   }

	   public List<House> getSubordinates(){
	     return houses;
	   }

	   public HouseItem getChild(int i) {
			return (HouseItem)houseComponent.get(i);
		}
	
	   public void print(){
	      System.out.println (houseno +","+ address
	      +","+ city + ","
	      + streetno+","+ zipcode);
	      Iterator<HouseItem> iterator = houseComponent.iterator();
			while (iterator.hasNext()) {
				HouseItem menuComponent = 
					(HouseItem)iterator.next();
				menuComponent.print();
			}
	   }   
	
}
