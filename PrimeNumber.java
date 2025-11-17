package Assignment;

	public class PrimeNumber
	{
        public static void main(String[] args)
	    {
            int number = 29;   // <-- Change this value to test any number
            boolean isPrime = true;
            // 1 and numbers less than 1 are not prime
	        if (number <= 1) 
	        {
	            isPrime = false;
	        }
	        else
	        {
	           for (int i = 2; i <= number / 2; i++)
	           {
	                if (number % i == 0)
	                {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Output
	        if (isPrime) 
	        {
	            System.out.println(number + " is a Prime Number");
	        } 
	        else 
	        {
	            System.out.println(number + " is NOT a Prime Number");
	        }
	    }
	}
