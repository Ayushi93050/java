class Person1{
	String name;
	int age;
	static String country = "India";
	void setPerson(String n , int a){
		name = n ;
		age = a ;
	}
	void getPerson(){
		System.out.println("Name :" +name+ "\t Age :" +age+"Country :"+country );
		
	}
}