import java.util.Scanner;

public class PermuteString
{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		permutation("",s	tr);
	}

	public static void permutation(String fixed,String sub)	{
		if(sub.equals(""))
		{
			System.out.println(fixed);
		}
		else
		{
			int a[] = new int[256];
			for(int i=0;i<sub.length();i++)
			{
				if(a[(int)sub.charAt(i)]==0)
				{
					a[(int)sub.charAt(i)]=1;
					permutation(	(fixed+sub.charAt(i)),
									sub.substring(0,i)+sub.substring(i+1,sub.length()));
				}
			}
		}
	}
}
