
public class Main {

	public static void main(String[] args) 
	{
		Hashing hash = new Hashing(10);
		Student s1 = new Student("Kartik",26,9934567890L,"kartik22gujar@gmail.com");
		Student s2 = new Student("Nakul",22,9857892583L,"abc22gujar@gmail.com");
		hash.insertL(s1);
		hash.insertL(s2);
		System.out.println("----------------------------");
		hash.removeL(s1);
		System.out.println(hash);
	}

}
