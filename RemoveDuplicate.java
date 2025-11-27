package week3.day2;

public class RemoveDuplicate
{
 	    public static void main(String[] args) {

	        String text = "We learn Java basics as part of java sessions in java week1";
	        String[] words = text.split(" ");

	        StringBuilder result = new StringBuilder();

	        for (String w : words) {
	            String lower = w.toLowerCase();

	            if (!result.toString().contains(lower)) 
	            {
	                result.append(lower).append(" ");
	            }
	        }

	        System.out.println(result.toString().trim());
	    }
	}


