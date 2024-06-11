package probleme;


	import java.util.Arrays;
import java.util.Random;
	import java.util.Scanner;

	public class password {
	    public static void main(String[] args) {
	        // Password component generation
	        char[] c = new char[95];
	        int i;
	        int j = 0;

	        for ( i = 33; i <= 126; i++) {
	            c[j] = (char) i;
	            j++;
	        }
 
	        
	        System.out.print("\n");
	      
	      
	        System.out.println();
	        Scanner scanner = new Scanner(System.in);
	        int n;
	        Random rand = new Random();

	        do {
	            System.out.print("Password length (minimum: 5, maximum: 15): ");
	            System.out.print("n = ");
	            n = scanner.nextInt();
	            if (n < 5 || n > 15) {
	                System.out.println("Wrong length!");
	            } else {
	                System.out.println("Correct length!");
	            }
	            System.out.println();
	        } while (n < 5 || n > 15);

	        int x, h = 0, m = 0, M = 0, d = 0, s=0,ok=0,min=33, max=127;
	        char[] p = new char[20];
	        
	        
	        System.out.println();

	       while(ok==0) {
	    	   m=0; M=0; d=0; s=0;
	        while (h <=n+1) {
	        
	            x = rand.nextInt((max - min) + 1) + min;
	            if (x >= 48 && x <= 57) d++;

	            else if (x >= 65 && x <= 90) M++;
	            else if (x >= 97 && x <= 122) m++;
	          
	            else   s++;
	            
	            p[h] = (char) x;
	            h++;   
	        }
	        
	        if(m>=1 && M>=1 && d>=1 && s>=1) 
	        	{ok=1;
	        	//for(i=0;i<n;i++)
	        		//p[i]=0;
	        	}
	        
	       }
	        
	   
	        
	        
	        for ( i = 0; i <=h; i++) {
                System.out.print(p[i]);
                
            }
	        System.out.print(" \n");
	        
	        for(i=0;i<=h;i++)
            System.out.print((int) p[i]+" ");
	        
	        System.out.println("\n s="+s+" M="+M+" m="+m+ " d="+d);
	        
	        
	        if (m >= 1 && M >= 1 && d >= 1 && s >= 1) 
	        { System.out.println("Correct generation!");
	        	 
	        
	        }
	         
	
	    }
	}

