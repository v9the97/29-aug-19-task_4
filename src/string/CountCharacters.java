package string;

public class CountCharacters {

	public static void main(String[]args)
	{
		int small=0,big=0,space=0;
	String s="hello user HYER RAM";
	int i=0;
	
	for(i=0;i<s.length();i++)
	{
	if(s.charAt(i)>96 && s.charAt(i)<123)
	{
		small++;
	}

	else if(s.charAt(i)>64 && s.charAt(i)<91)
	{
	big++;
	}
	else if(s.charAt(i)==32 )
	{
	space++;
	}
	}

	System.out.print(" small "+small +" big "+big +" space  "+space);

	}
	}
