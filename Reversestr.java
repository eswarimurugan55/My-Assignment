package week3.day1;
 public class Reversestr
 {
public static void main(String[] args)
  {
	  String name="Beautiful";
	  char[] ch=name.toCharArray();
      System.out.println("The Reverse String is:");
      for(int i=ch.length-1;i>=0;i--)
      {
    	  System.out.println(ch[i]);
      }
   }
}
 