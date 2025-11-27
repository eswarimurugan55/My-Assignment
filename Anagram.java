package week3.day2;
import java.util.Arrays;


public class Anagram 
{
       public static void main(String[] args)
       {
	        String T1 = "stops";
	        String T2 = "potsers";
	        
	        if(T1.length() != T2.length())
	        {
	            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
	            return; 
	        }
	        
	        char[] str1 = T1.toCharArray();
	        char[] str2 = T2.toCharArray();
	        
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	        
	        if(Arrays.equals(str1, str2)) 
	        {
	            System.out.println("The given strings are Anagram.");
	        } 
	        else 
	        {
	            System.out.println("The given strings are not an Anagram.");
	        }
	    }
	}

