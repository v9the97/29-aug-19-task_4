package string;
import java.util.HashMap;
import java.util.Map;

public class DomainMailSeprate {
	

	
	

		public static void main(String[] args) {
			
			String email[]={"tanishsharma14@gmail.com","tanishsharma@yahoo.com","tanishsharma@radiffmail.com","jay@gmail.com"};
			
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			
			for(int i=0;i<email.length;i++)
			{
				String temp[]=email[i].split("@");
				
				if(map.containsKey(temp[1]))
				{
					map.put(temp[1],map.get(temp[1])+1);
				}
				else
				{
					map.put(temp[1], 1);
				}
			}
			
			for(Map.Entry<String,Integer> entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}

	}

