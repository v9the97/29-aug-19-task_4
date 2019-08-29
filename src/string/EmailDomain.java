package string;

public class EmailDomain {
	public static void main(String[]args)
	{
	
	int i=0,gc=0,yc=0,oc=0,j,k,count=0;
	String g="gmail",y="yahoo",r="outlook";	
	String mail[]={"vinod@gmail.com","vijay@yahoo.com","rahul@outlook.com","vinod@gmail.com","vijay@yahoo.com","rahul@outlook.com","vinod@gmail.com","vijay@yahoo.com","rahul@outlook.com","vinod@gmail.com","vijay@yahoo.com","rahul@outlook.com"};
	for( i=0;i<mail.length;i++)
	{
		j=mail[i].indexOf("@");
		k=mail[i].indexOf(".");
		if(g.equals(mail[i].substring(j+1,k)))
				{
			gc++;
			count++;
				}
		else if(y.equals(mail[i].substring(j+1,k)))
				{
			yc++;
			count++;
				}
		else if(r.equals(mail[i].substring(j+1,k)))
				{
			oc++;
			count++;
				}
		
	}
	System.out.println("gmail  "+gc);
	System.out.println("yahoo  "+yc);
	System.out.println("outlook  "+oc);
	System.out.println("Total Domain   "+count);
	}
	
}
