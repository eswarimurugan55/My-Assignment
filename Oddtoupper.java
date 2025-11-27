package week3.day1;

public class Oddtoupper
{
  public static void main(String[] args)
  {
    String abc="changeme";
    char[] ch=abc.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	if(i%2!=0)
    	{
    		ch[i]=(char)Character.toUpperCase(ch[i]);
    		
    	}
    }
    System.out.println(ch);
  }
}
