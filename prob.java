//Carnat Antonia
			//11. Implementați jocul X-0 naiv ca și joc automat. Programul va selecta aleator la fiecare pas o poziție pe care o va completa
			//fie cu X, fie cu 0 în mod alternativ. Poziția selectată nu poate fi una completată deja. Jocul se termină atunci când nu mai există 
			//casuțe libere sau când unul dintre jucători a obținut o linie, coloană sau diagonală completă. Afișați pe ecran fiecare pas al 
			//algoritmului sub forma unei matrici, caracterul * va reprezenta o casuță necompletată.

package probleme;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
import java.util.Arrays;

	

			
		
			public class prob {
				
				 
				static Scanner citire=new  Scanner(System.in);
				
				public static void main(String[] args) {
					Random random = new Random();
					char [][]a=new char[3][3];
					int b,c,d,k=0,f=0;
					char x='X',o='O';
			       
					char p='*';
					
					int i,j;
					for(i=0;i<3;i++)
						for(j=0;j<3;j++)
							a[i][j]=p;
					int ok=0;
					while((k<=9&&ok==0)) {b = random.nextInt(3);
					c = random.nextInt(3);
					if(a[b][c]!=p) {b = random.nextInt(3);
					c = random.nextInt(3);}
					else{if(k%2==0)
						a[b][c]=x;
						else a[b][c]=o;
					k=k+1;
					
					
					
					
					for(i=0;i<3;i++)
						{for(j=0;j<3;j++)
							System.out.print(a[i][j]);
						System.out.println();
						}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					if(a[0][0]==x && a[0][1]==x && a[0][2]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[0][0]==o && a[0][1]==o && a[0][2]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[1][0]==x && a[1][1]==x && a[1][2]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[1][0]==o && a[1][1]==o && a[1][2]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[2][0]==o && a[2][1]==o && a[2][2]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[2][0]==x && a[2][1]==x && a[2][2]==x) {ok=1;System.out.println("Joc terminat");}


					if(a[0][0]==x && a[1][0]==x && a[2][0]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[0][0]==o && a[1][0]==o && a[2][0]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[0][1]==x && a[1][1]==x && a[2][1]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[0][1]==o && a[1][1]==o && a[2][1]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[0][2]==o && a[1][2]==o && a[2][2]==o) {ok=1;System.out.println("Joc terminat");}
					if(a[0][2]==x && a[1][2]==x && a[2][2]==x) {ok=1;System.out.println("Joc terminat");}
					
					if(a[0][0]==x && a[1][1]==x && a[2][2]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[0][0]==o && a[1][1]==o && a[2][2]==o) {ok=1;System.out.println("Joc terminat");}
					
					if(a[0][2]==x && a[1][1]==x && a[2][0]==x) {ok=1;System.out.println("Joc terminat");}
					if(a[0][2]==o && a[1][1]==o && a[2][0]==o) {ok=1;System.out.println("Joc terminat");}
					}
					}
				}
			}

		
		
		




	
