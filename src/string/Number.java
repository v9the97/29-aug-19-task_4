package string;

public class Number {
	public static void main(String[]args)
	{
		
	int i=0,cs=0,it=0,mech=0,count=0,civil=0;
	String g="12",y="34",r="56",c="78";	
	String mail[]={"123456","34567","56789","781234"};
	for( i=0;i<mail.length;i++)
	{
		
		if(g.equals(mail[i].substring(0,2)))
				{
			cs++;
			
				}
		else if(y.equals(mail[i].substring(0,2)))
				{
			it++;
			
				}
		else if(r.equals(mail[i].substring(0,2)))
				{
			mech++;
			
				}
		else if(r.equals(mail[i].substring(0,2)))
		{
	civil++;
	
		}
		
	}
	System.out.println("CS  "+cs);
	System.out.println("IT  "+it);
	System.out.println("MECH  "+mech);
	System.out.println("CIVIL "+civil);
	
	System.out.println("Total Student   "+mail.length);
	}
	
}



