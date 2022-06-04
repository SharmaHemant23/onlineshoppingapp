

public class Student {

	String Name;
	int Age ;
	long mobail_no;
	String email;
	
	
	Student(String Name, int Age, long mobail_no, String email )
	{
		this.Name = Name;
		this.Age = Age ;
		this.mobail_no=mobail_no;
		this.email=email;
	}
	


	public String toString() 
	{
		return " Student [Name=" + Name + ", Age=" + Age + ", Mobail No= " + mobail_no + " Email Id  " + email + "]";
		
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public long getMobailNo()
	{
		return mobail_no;
	}
	public String getEmail()
	{
		return email;
	}
	public void setMobailNo(int mobailNo)
	{
		this.mobail_no=mobailNo;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	
}