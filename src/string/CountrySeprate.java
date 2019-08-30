package string;

public class CountrySeprate {

	public static void main(String[]args)
	{
	String s="India,Australia,Canada,Brazil,New zealand";

	int i,j=0,c=0,k=0,l;
	l=s.length();
	for(i=0;i<l;i++)
	{
	if(s.charAt(i)==',')
	{
	k=i;
	System.out.println(s.substring(c,k));
	c=k+1;
	}
	}
	System.out.print(s.substring(c,s.length()));
	}
	}
