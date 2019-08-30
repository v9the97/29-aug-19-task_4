package string;

public class RemoveDigits {
	public static void main(String[]args)
	{
			String r;
		String s="abcd123784698hgftAbc";
			r=s.replaceAll("[0-9]","");
		System.out.print(" "+r);
	}
	
}
