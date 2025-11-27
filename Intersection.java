package week3.day1;

public class Intersection
{
	public static void main(String[] args)
	{
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		System.out.println("The matching elements are:");
		
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<b.length;y++) 
			{
				if(a[x]==b[y])
				{
				System.out.println(a[x]);
				}
			}

		}
	}

}
