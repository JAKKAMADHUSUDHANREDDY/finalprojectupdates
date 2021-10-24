import java.util.Scanner;

public class houseContext {

	private state Buy;
	private state sold;
	private state review;

	private state s;
	
	public houseContext(String name) {
	 Buy = new buy(name);
	 sold = new sale(name);
	 
	}

	public void startstate()
	{
		s.startstate();
	}
	public void endstate()
	{
		s.endstate();
	}
	public state getS() {
		return s;
	}


	public void setS(state s) {
		this.s = s;
	}


	public state getBuy() {
		return Buy;
	}

	public void setBuy(state buy) {
		Buy = buy;
	}

	public state getSold() {
		return sold;
	}

	public void setSold(state sold) {
		this.sold = sold;
	}

	public state getReview() {
		return review;
	}

	public void setReview(state review) {
		this.review = review;
	}
	
	

}
