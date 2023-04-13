
package oop;

interface LibraryUser{
	
	
	void registerAccount();
	void requestBook();
	
}

class KidUser implements LibraryUser{

	int age;
	String bookType;
	
	//using Constructor to set values
	public KidUser(int age , String bookType) {
		super();
		this.age=age;
		this.bookType=bookType;
		
	}
	
	@Override
	public void registerAccount() {
		if(age>0 && age<=12)
			System.out.println("You have Successfully registered under Kids account!");
		else 
			System.out.println("Sorry, Age must be less than 12 to register as a kid!");
		
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Kids"))
			System.out.println("“Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books !");
					
	}
	
}

class AdultUser implements LibraryUser{

	int age;
	String bookType;
	

	public AdultUser(int age , String bookType) {
		super();
		this.age=age;
		this.bookType=bookType;
	}
	
	@Override
	public void registerAccount() {
		if(age>12 && age<100) 
			System.out.println("You have successfully registered under an Adult Account");
		
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Fiction") && age>12) 
			System.out.println("Book Issued successfully, please return the book within 7 days ");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		
	}
		
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
    
    //creating Instance of KidUser class
		KidUser kd1 = new KidUser(10 , "Kids");
		System.out.println("Kid's Age : " + kd1.age);
		System.out.println("Book Type : " + kd1.bookType);
		kd1.registerAccount();
		kd1.requestBook();
		
    System.out.println();
		
		KidUser kd2 =  new KidUser(18,"Fiction"); 
		System.out.println("Kids Age : "+kd2.age);
		System.out.println("Book type : "+kd2.bookType);
		kd2.registerAccount();
		kd2.requestBook();
		
		System.out.println();
		
		//creating instance of AdultUser Class
		AdultUser ad1 = new AdultUser(5,"Kids"); 
		
		System.out.println("User Age : "+ad1.age);
		System.out.println("Book Type : "+ad1.bookType);
		ad1.registerAccount();
		ad1.requestBook();
		
		System.out.println();
		
		AdultUser ad2 = new AdultUser(12,"Fiction"); 
		System.out.println("User Age : "+ad2.age);
		System.out.println("Book Type : "+ad2.bookType);
		ad2.registerAccount();
		ad2.requestBook();
			

	}

}
