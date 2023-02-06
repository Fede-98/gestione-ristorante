import java.util.ArrayList;

public class Tavolo {
	private int id;
	private int nCoperti;
	private int saldo;
	private ArrayList lista;
	
	
	Tavolo(int i,int nCop){
	 id=i;
	 nCoperti=nCop; 
	 saldo=0;
	 ArrayList l=new ArrayList(0); 
	 lista=l;
	 }
	
    public void ins(Vivande elemento){
	if (elemento.getPrz()!=0)
		lista.add(elemento);
	}
    
    public int calcolaSaldo(){
     int tot=0;
      for(int i=0; i < lista.size(); i++)
    	  tot+=((Vivande)lista.get(i)).getPrz();
       return tot;
       }
    
    public int getId() {
    	return id;
    	}
    
    public int getNcop() {
    	return nCoperti;
    	}
    
    public int getSaldo() {
     saldo=calcolaSaldo();
     return saldo;
     }
     
    public String getLista() {
     String s="\n";
      for(int i=0;i < lista.size();i++){
        s+=((Vivande)lista.get(i)).getNom();
        s+="-"+((Vivande)lista.get(i)).getPrz()+"€ "+"\n";
        } 
      return s; 
    }
     
    public String toString(){
       return "Tavolo n"+getId() + ":\n" +"Coperti "+getNcop() + ":"+ getLista()+"\nSaldo:"+getSaldo()+"€";
       }
}
