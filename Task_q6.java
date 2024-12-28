write a java program to print bellowed pattern ->i and j and k=>5
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2 
5 4 3 2 1


public class Pattern {

	
	    public static void main(String[] args)
	    {
	        int n = 5; 

	        for (int i = 0; i < n; i++) 
	        {
	          
	            for (int j = 0; j < n; j++)
	            {
	              
	                if (j <= i)
	                {
	                    System.out.print((n - j) + " "); 
	                }
	                else 
	                {
	                    System.out.print(n + " "); 
	                }
	            }
	            
	            System.out.println();
	        }
	    }
	}