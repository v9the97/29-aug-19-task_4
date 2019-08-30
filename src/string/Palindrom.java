package string;

public class Palindrom {

	public static void main(String[]args)
	{
	int i=0,k=0,l,l1;
	String temp="abdddcba";
	l=temp.length()/2;
	l1=temp.length();
	for(i=0;i<l;i++)
	{
	if(temp.charAt(i)==temp.charAt(l1-1-i))
	{
	k=1;
	}
	else
	{
	k=0;
	break ;
	}
	}

	if(k==1)
	System.out.print("  palindome   ");
	else
	System.out.print(" not palindome   ");
	}
	}
