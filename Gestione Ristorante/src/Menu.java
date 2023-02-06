
public class Menu {
	private Vivande Piatti[];
	private Vivande Bevande[];
	
	Menu(){
		Vivande p1=new Vivande("Spaghetti alla Carbonara", "guanciale, uova, pecorino romano, pepe", 8);
	    Vivande p2=new Vivande("Pizza Margherita","pomodoro, mozzarella e basilico",5);
	    Vivande p3=new Vivande("Cicoria ripassata", "cicoria, olio evo, aglio, peperoncino, sale", 4);
	    Vivande p4=new Vivande("Salmone in Umido","salmone, olive nere, pomodorini, cipolla", 12);
	    Vivande p5=new Vivande("Bistecca alla Fiorentina", "bistecca, olio evo, pepe",50);
	    Vivande p[]={p1,p2,p3,p4,p5};
	    Piatti=p;
	    
	    
	    Vivande b1=new Vivande("Acqua Naturale","non frizzante",3);
	    Vivande b2=new Vivande("Primitivo di Manduria","Denominazione di origine controllata, prodotto in provincia di Taranto",8);
	    Vivande b3=new Vivande("Ichnusa", "Non filtrata", 5);
	    Vivande b[]={b1,b2,b3};
	    Bevande=b;
	    }
	
	
	public Vivande getP(int cod) {return Piatti[cod];}
	
	public Vivande getB(int cod) {return Bevande[cod];}
	
	public void mostraP() {
	for(int i=0;i < Piatti.length;i++)
	   System.out.println(i+"."+Piatti[i].getNom()+ " "+ Piatti[i].getPrz()+"€"+"\n"+Piatti[i].getDescrz());
	}
	public void mostraB(){
	for(int i=0;i < Bevande.length;i++)
	    System.out.println(i+"."+Bevande[i].getNom()+" "+Bevande[i].getPrz()+"€"+"\n"+Bevande[i].getDescrz());
	}
}
