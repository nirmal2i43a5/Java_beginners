class Person     
{   
     String name, address, emailAddress ;
     Long  phoneNumber ;	
     Person( )
       { 
              System.out.println(“I am default constructor of Person class”) ;
       }
		
}
class Employee extends Person
{
	int salary;
	String organization;
	int year_of_service;
	String e_Name;
	String e_Address;
	int e_Phone;
	String e_Email;
	String e_Organization;
	int e_Salary;
	int e_year_of_service;
	Employee( )
	   {
                           System.out.println(“I am default constructor of Employee class”) ;

	   }

Employee(String name, String address, Long phoneNumber,String emailAddress, String organization,  int salary, int year_of_service)
	{
					 e_Name = name ;
					 e_Address = address ;
					 e_Phone = phoneNumber ;
					 e_Email = emailAddress ;
					 e_Organization = organization ;
					 e_Salary = salary ;
					 e_year_of_service = year_of_service ;

	}


	void displayEmployee( )
	      {

		System.out.println(e_Name);
		System.out.println(e_Address);
		System.out.println(e_Phone);
		System.out.println(e_Email);
		System.out.println(e_Organization);
		System.out.println(e_Salary);
		System.out.println(e_year_of_service);


	      }

}
		
public class TestEmployee  
{  
 public static void main(String[ ] args)
    { 
	   
	Person o = new Person( ) ;
	Employee o1 = new Employee( ); 
    Employee o2 =new
    Employee("Nirmal","Butwal",981297,"nirmal@gmail.com","Verisk_Nepal",9000,2) ;

	   o2. displayEmployee( )  ;
	
    }
 }
	


