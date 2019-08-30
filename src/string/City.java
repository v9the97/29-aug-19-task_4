package string;

public class City {
	public static void main(String[]args)
	{
	String cities[]={"bhopal","agra","ujjain","dewas","indore","raipur"};
	int i,j,k,l,k1,check=0;
	String temp,temp1,temp2;
	for(i=0;i<cities.length-1;i++)
	{

	temp1=cities[i];
	temp2=cities[i+1];
	for(j=i+1;j<cities.length;j++)
	{
	check=0;
	if(temp1.length()>temp2.length())
	{l=temp2.length();}
	else 
	l=temp1.length();
	for(k=0,k1=0;k<l;k++,k1++)
	{
	if(cities[i].charAt(k)>cities[j].charAt(k1))
	{
	check=1;

	break;
	}
	else
	break;

	}
	if(check==1)
	{
	temp=cities[i];
	cities[i]=cities[j];
	cities[j]=temp;
	}
	}
	}

	for(i=0;i<cities.length;i++)
	System.out.print("     "+cities[i]);
	}
	}

