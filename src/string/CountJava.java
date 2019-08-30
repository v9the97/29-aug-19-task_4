package string;

public class CountJava {
	public static void main(String[]args)
	{
	String s="i love java.yes java is dream java java java";
	char find[]={'j','a','v','a'};
	int i,j=0,c=0,k=0,l;
	l=s.length();
	for(i=0;i<l;i++)
	{
	j=0;
	c=0;
	if(s.charAt(i)==find[j])
	{
	i++;
	for(j=1;j<4&&i<l;j++)
	{
	if(s.charAt(i)==find[j])
	{
	c=1;
	//System.out.print(""+s.charAt(i));
	i++;
	}
	else
	{
	c=0;
	i--;
	break;
	}
	}
	}
	if(c==1)
	{
	k++;
	System.out.print(" java ");
	}
	}
	System.out.print(""+k);
	}
	}


