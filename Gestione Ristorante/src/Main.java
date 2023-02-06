/*Gestioni ordinazioni ristorante. 
 * Creare Array e Classe contenente il seguente record logico:
 * Menù { CodPort, Descrizione, Tipo, Prezzo}
 * 
 * Le ordinazioni verranno gestite con un Array del seguente record logico:
 * Rec_Tavola {CodTav, CodPort, Quantità, Descrizione, Prezzo, Progress};
 * A fine giornata determinare l’incasso della giornata e quello totale di ogni tavolo e azzerare infine l’Array**/


import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int totale=0;
		int j;
		int prez=0;
		char ch=0;
		String nome="";
		String descrz="";
		Menu menu=new Menu();	
		Tavolo Tavoli[];
			Tavolo tavolo1 = new Tavolo(1,3);
			Tavolo tavolo2 = new Tavolo(2,3);
			Tavolo tavolo3 = new Tavolo(3,3);
			Tavolo[] tav= {tavolo1,tavolo2,tavolo3};
	        Tavoli=tav;
		
		
		 System.out.println("Benvenuto!");
		 System.out.println("Digita b per visulizzare le bevande oppure p per visualizzare i piatti. Digita x per uscire:");
 for(int i=0;i <Tavoli.length;i++) {
		 do{
			 try {
		   System.out.print("Piatti(p),Bevande(b), Exit(x): ");
		   Scanner q = new Scanner(System.in);
			ch=q.nextLine().charAt(0);
			   if(ch=='p')menu.mostraP();
			   else if(ch=='b')menu.mostraB();
			   else break;
			   System.out.print("Inserire codice prodotto:");
			   j=q.nextInt();
		
		   if(ch=='p'||ch=='b'){
		   if(ch=='p'){
		      nome=menu.getP(j).getNom();
		      prez=menu.getP(j).getPrz();
		      descrz=menu.getP(j).getDescrz();
		   } else {
		      nome=menu.getB(j).getNom();prez=menu.getB(j).getPrz();descrz=menu.getB(j).getDescrz();
		      }
		   } 
			 }catch (ArrayIndexOutOfBoundsException errore) {
				System.out.println("Codice prodotto non valido");
			}
		   Vivande elemento =new Vivande(nome,descrz,prez);
		   Tavoli[i].ins(elemento);
		   
		System.out.println(Tavoli[i].toString());
		
		}while(ch!='x');
	//System.out.println(totale);
	}
 }
}



/*int inc;
int tmp=Tavoli[i].getSaldo();
inc=tmp;
totale= inc++;*/