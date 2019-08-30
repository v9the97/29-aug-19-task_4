package string;
import java.util.*;
public class CreateToken{
public static void main(String[]args)
{
String tok="1.java,2.oracle,3.python,4.php";
StringTokenizer st=new StringTokenizer(tok,",1,2,3,4,5");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}