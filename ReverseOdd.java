package week3.day2;

public class ReverseOdd 
{
	public static void main(String[] args) 
	{

        String text = "I am a software tester";     
        String[] words = text.split(" ");           
        for(int i = 0; i < words.length; i++) 
        {
            
            if(i % 2 != 0)
            {                        
                char[] ch = words[i].toCharArray();
                String rev = "";

                for(int j = ch.length-1; j >= 0; j--) 
                {
                  rev = rev + ch[j];                           
                }

                words[i] = rev;                    
           }
        }

        // Print final output
        for(String w : words) 
        {
            System.out.print(w + " ");
        }
    }
}



