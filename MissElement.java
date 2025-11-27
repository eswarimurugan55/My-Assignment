
package week3.day1;

import java.util.Arrays;

//import java.util.Arrays;

public class MissElement
{
  public void main(String[] args)
  {
	  int[] a= {1,4,3,2,8,6,7};
	  Arrays.sort(a);
	  for(int x=0;x<a.length;x++)
	  {
		  if(a[x]!=(x+1))
		  {
			System.out.println("The Missing Number is:"+(x+1));  
			break;
		  }
	  }
	  
  }
}
