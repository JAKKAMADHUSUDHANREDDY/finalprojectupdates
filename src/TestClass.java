import java.util.Scanner;

public class TestClass {

	public static void main(String args[])
	  {
		String n;
		String email;
		String phoneno;
		String address;
		String type; 
		int choice;
	 
		String houseno;
		String haddress;
		String city;
		String streetno; 
		String zipcode;
	    Scanner in = new Scanner(System.in);
	     
	     System.out.println("Enter 1 for houseOwner and 2 for HouseBuyer : ");
	     System.out.println(" 1. HouseOwner \n 2. HouseBuyer");
	     choice = in.nextInt();
	     in.nextLine();

	     if(choice == 1)
	     {
	    	 //Factory pattern
	    	 UserFactory users = new UserFactory();
	 	     UserAdd u = new UserAdd(users);
	 	     
	 	     User user = u.create("", "", "", "", "ho");
	 	     System.out.println(user);
	 	     
	 	     System.out.println("Enter your house no: ");
		     houseno = in.nextLine();
		     System.out.println("Enter your house address: ");
		     haddress = in.nextLine();
		     System.out.println("Enter city name: ");
		     city = in.nextLine();
		     System.out.println("Enter street no: ");
		     streetno = in.nextLine();
		     System.out.println("Enter zip code: ");
		     zipcode = in.nextLine();
		     
		    //Composite Design Pattern
	    	 HouseItem h1 = new House("Hno1","Church Lane","london", "1","5687");
	    	 HouseItem h2 = new House("Hno2","Church Lane","london", "2","5687");
	    	 HouseItem h3 = new House("Hno3","Church Lane","london", "3","5687");
	    	 HouseItem allhouses = new House("Hno","Address","City", "Street no","Zip code");

	    	 allhouses.add(h1);
	    	 allhouses.add(h2);
	    	 allhouses.add(h3);
	    	 
	     }
	     else if(choice == 2)
	     {
	  	  //Factory design pattern
		 UserFactory users = new UserFactory();
		 UserAdd u = new UserAdd(users);
		     
	     System.out.println("Enter your name: ");
	     n = in.nextLine();
	     System.out.println("Enter your email: ");
	     email = in.nextLine();
	     System.out.println("Enter your phoneno: ");
	     phoneno = in.nextLine();
	     System.out.println("Enter your address: ");
	     address = in.nextLine();
	     	     
	     User user = u.create(n, email, phoneno, address, "hb");
	     System.out.println(user);
	     
	     String yesno;
	     System.out.println("Do you want to buy the house? y/n");	
	     yesno = in.nextLine();
	     if(yesno.equals("y"))
	     {
	    	 

	    	 AddHouse h = new AddHouse();
	    	 //Iterator design pattern
	    	 Iterator houseIterator = h.createIterator();
		     System.out.println("Which House do you want to buy???");
		     printHouse(houseIterator);
		     String hno;
		     System.out.println("PLease Enter the house no");	     
	    	 hno = in.nextLine();
	    	 //State design pattern
		     houseContext hs = new houseContext(hno) ;
		 	 state s;
		     s = new buy(hno);
			 s.startstate();
			 s = new sale(hno);
			 s.startstate();
			 s = new review(hno);
			 s.endstate();
			 String r;
			 System.out.println("kindly review the house... ");
			 r = in.nextLine();
			 s = new review(r);
			 s.startstate();
	     }
	     else if(yesno.equals("n"))
	     {
		     System.out.println("You don't buy house !!!");	     
	     }
	     }
	     else
	     {
		     System.out.println("Invalid choice !!!");	     
	     }
	  }
	private static void printHouse(Iterator iterator) {
		int i= 1;
		//Iterator Pattern
		while (iterator.hasNext()) {
			String Item = (String)iterator.next();
			System.out.println(i +" "+Item);
			i++;			      
		}
	}

}
