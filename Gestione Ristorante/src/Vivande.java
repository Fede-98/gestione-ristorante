
public class Vivande {
	
		private String nome;
		private String descrizione;
		private int prezzo;
		
		Vivande(String id,String descrz, int prz){
		nome=id;
		descrizione=descrz;
		prezzo=prz;
		}

		public String getNom() {
			return nome;
		}
		public String getDescrz() {
			return descrizione;
		}
		public int getPrz() {
			return prezzo;
		}
		
		

}
