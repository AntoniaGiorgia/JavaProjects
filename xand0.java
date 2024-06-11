package probleme;


// A simple game of x and 0 between user and PC



import java.util.Scanner;
import java.util.Random;
import java.lang.String;
import java.util.Arrays;
public class xand0 {
	
	 
	static Scanner read=new  Scanner(System.in);
	
	public static void main(String[] args) {
		
		int vef=0;
		char calc='0';
		char play='x';
		while(vef==0)
		{
			
		System.out.println("Choose the character(X or 0):");
		String input= read.nextLine();
		char str=input.charAt(0);
		if(str=='x') {
			vef=1;
			play='X';
			calc='0';
		}
		else if(str=='0')
		{vef=1;
		play='0';
		calc='X';
			
		}
		
		else
			System.out.println("Again");
		}
		
		Random random = new Random();
		char [][]a=new char[3][3];
		int b,c,d,k=0,f=0,i,j;
		
     
		char p='*';
		
		System.out.println(" 012");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=p;
		
		for( i=0;i<3;i++)
		{
			System.out.print(i);
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("\n");
			
		}	
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		
		int ok=0;
		while((k<=9&&ok==0)) 
		{
			
			System.out.println("Choose a vacant position:");
			String input= read.nextLine();
			char str2=input.charAt(0);
			char str3=input.charAt(1);
			
		
			  int nr1 = Character.getNumericValue(str2);
			  int nr2 = Character.getNumericValue(str3);
			if(a[nr1][nr2]==p) 
				a[nr1][nr2]=play;
			
			for(i=0;i<3;i++)
			{for(j=0;j<3;j++) 
				System.out.print(a[i][j]);
			System.out.println();
			}
			
			System.out.print("               ");
			System.out.print("\n");
			
			do {
			c = random.nextInt(3);
			b = random.nextInt(3);
		
			}
		while(a[b][c]!=p);
			a[b][c]=calc;
			
		k=k+1;
		
		for(i=0;i<3;i++)
			{for(j=0;j<3;j++) 
				System.out.print(a[i][j]);
			System.out.println();
			}
	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if(a[0][0]==play && a[0][1]==play && a[0][2]==play) {ok=1;System.out.println("Winner");}
		if(a[0][0]==calc && a[0][1]==calc && a[0][2]==calc) {ok=1;System.out.println("Game Over");}
		if(a[1][0]==play && a[1][1]==play && a[1][2]==play) {ok=1;System.out.println("Winner");}
		if(a[1][0]==calc && a[1][1]==calc && a[1][2]==calc) {ok=1;System.out.println("Game over");}
		if(a[2][0]==play && a[2][1]==play && a[2][2]==play) {ok=1;System.out.println("Winner");}
		if(a[2][0]==calc && a[2][1]==calc && a[2][2]==calc) {ok=1;System.out.println("Game Over");}
		


		if(a[0][0]==play && a[1][0]==play && a[2][0]==play) {ok=1;System.out.println("Winner");}
		if(a[0][0]==calc && a[1][0]==calc && a[2][0]==calc) {ok=1;System.out.println("Game Over");}
		if(a[0][1]==play && a[1][1]==play && a[2][1]==play) {ok=1;System.out.println("Winner");}
		if(a[0][1]==calc && a[1][1]==calc && a[2][1]==calc) {ok=1;System.out.println("Game Over");}
		if(a[0][2]==calc && a[1][2]==calc && a[2][2]==calc) {ok=1;System.out.println("Game Over");}
		if(a[0][2]==play && a[1][2]==play && a[2][2]==play) {ok=1;System.out.println("Winner");}
		
		if(a[0][0]==play && a[1][1]==play && a[2][2]==play) {ok=1;System.out.println("Winner");}
		if(a[0][0]==calc && a[1][1]==calc && a[2][2]==calc) {ok=1;System.out.println("Game Over");}
		
		if(a[0][2]==play && a[1][1]==play && a[2][0]==play) {ok=1;System.out.println("Winner");}
		if(a[0][2]==calc && a[1][1]==calc && a[2][0]==calc) {ok=1;System.out.println("Game Over");}
		}
		}
	
}

