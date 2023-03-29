public class Pascal
{
	public static int calculate(int n){
      if (n == 0) 
        return 1;
    
      return n * calculate(n - 1);
    }
	
	public static void printPascal(int n){
	      for (int i = 0; i <= n; i++){
	    	  for (int j = 0; j <= i; j++) 
	    		  System.out.print(" " + calculate(i) / (calculate(i - j) * calculate(j)));
	        
	       System.out.println("");
		}
	}
	 
	 public static void main(String[] args){
	      System.out.println(" PRINT VERTICAL: ");
	      printPascal(7);
	}
}
