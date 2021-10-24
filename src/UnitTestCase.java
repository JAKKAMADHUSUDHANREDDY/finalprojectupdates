import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UnitTestCase {

	@Test
	void test() {
		 //Factory Design pattern for Admin
		 UserFactory users = new UserFactory();
 	     UserAdd u = new UserAdd(users);
 	     
 	     User user = u.create("", "", "", "", "ho");
 	     System.out.println(user);
 	     
 	    //Composite Design Pattern
    	 HouseItem h1 = new House("Hno1","Church Lane","london", "1","5687");
    	 HouseItem h2 = new House("Hno2","Church Lane","london", "2","5687");
    	 HouseItem h3 = new House("Hno3","Church Lane","london", "3","5687");
    	 HouseItem allhouses = new House("Hno","Address","City", "Street no","Zip code");

    	 allhouses.add(h1);
    	 allhouses.add(h2);
    	 allhouses.add(h3);
    	 
    	 allhouses.print();
		 //Factory Design pattern for User

    	 UserFactory userfac = new UserFactory();
		 UserAdd useradd = new UserAdd(userfac);
	     User uu = useradd.create("john", "john@email.com", "+43232441", "London", "hb");
	     System.out.println(uu);
    	 allhouses.print();

    	 
	     houseContext hs = new houseContext("Hno1") ;
	 	 state s;
	     s = new buy("Hno1");
		 s.startstate();
		 s = new sale("Hno1");
		 s.startstate();
		 s = new review("Hno1");
		 s.endstate();
		 s = new review("Nice House!!!");
		 s.startstate();
		fail("Not yet implemented");
	}

}
