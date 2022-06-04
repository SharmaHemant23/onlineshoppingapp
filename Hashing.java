
public class Hashing 
{

	Student [] strarr;
	
	public Hashing(int size) 
	{
		strarr = new Student[size];
	}
	
	public int hashFunction(Student inString)
	{
		long mNo=inString.mobail_no;
		int sum=0,con;
		for(int i=0; i<=mNo; i++)
		{
			con =(int)(mNo % 100);
			mNo=mNo/100;
			sum = sum + con;
		}
		int index = sum % strarr.length;
		return index;
	}

	public void insertL(Student inString)
	{
		int index = hashFunction(inString);
		System.out.println(inString + "  key from the hasFuncton =  " + index  );
		
		if(strarr[index] == null)
		{
			strarr[index] = inString;
		}
		else
		{
			while(true)
			{
			if(index>strarr.length-1)
				index++;
			else
				index=0;
			if(strarr[index] == null)
			{
				strarr[index] = inString;
				break;
			}
			
			}
			
		}
		System.out.println(inString + " in at the place of  " + index  );
	}
	
	
	public void removeL(Student inString)
	{
		int i = searchL(inString);
		strarr[i]=null;
		System.out.println(" and it is Remove from " + i);
	}
	
	
	
	private int searchL(Student inString)
	{
		
		int index = hashFunction(inString);
		System.out.print(inString + "  key from the hasFuncton =  " + index  );
		
		if(strarr[index] != null && strarr[index].equals(inString))
		{
			return index;
		}
		else
			while(true)
			{
				if(index >strarr.length-1)
					index++;
						else
					index=0;
				if(strarr[index] != null && strarr[index].equals(inString))
				{
					return index;
				}
				
			}
				
	}

	
				
	
	



	public String toString()
	{
		String str = "";
		str +="{";
			for (int i = 0; i < strarr.length; i++)
			{
				str+= strarr[i] + ", " ; 
			}
			str+="}";
			
			return str;
	}

}