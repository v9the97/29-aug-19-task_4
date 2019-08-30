package string;

public class BranchCounter {
	

		public static void main(String[] args) {
			
			int cs=0,it=0,mech=0,civil=0;
			String rollno[]={"1234","3456","5678","789","1258"};
			
			for(int i=0;i<rollno.length;i++)
			{
				if(rollno[i].charAt(0)=='1'&&rollno[i].charAt(1)=='2')
					cs++;
				else if(rollno[i].charAt(0)=='3'&&rollno[i].charAt(1)=='4')
					it++;
				else if(rollno[i].charAt(0)=='5'&&rollno[i].charAt(1)=='6')
					mech++;
				else if(rollno[i].charAt(0)=='7'&&rollno[i].charAt(1)=='8')
					civil++;
			}
			
			
			System.out.println("CS Students are:"+cs);
			System.out.println("IT Students are:"+it);
			System.out.println("Mechnical Students are:"+mech);
			System.out.println("Civil Students are:"+civil);

		}

	}

