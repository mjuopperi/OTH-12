package pokerikadet;

import java.util.Random;

public class Pakka {
    
    // Näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista Pakka.KORTTILKM
    final static int KORTTILKM = 52;
    
    // Esittele instanssimuuttujat
    private Kortti[] korttipakka = new Kortti[53];
    private int vuorossa = 1;
    
    // Kirjoita konstruktori, joka alustaa pakan Kortti-olioilla
    public Pakka() {
	int j=0;
	for (int m=0; m<=3; m++) {
		for (int i=1; i<= 13; i++){
			korttipakka[i+j*13] = new Kortti(m,i);
			System.out.println("testing " + 
					"indeksi: " + (i+j*13) + " " + korttipakka[i+j*13].toString());

		}
		j++;
		}
       // this.shuffle();
}   
    
    // Kirjoita metodi sekoita()
    public void sekoita() {
        int vaihdaA, vaihdaB;
        Kortti temp;
        for (int i=1; i <= 100; i++) {
            vaihdaA = 1 + (int) (Math.random()*52); 
            vaihdaB = 1 + (int) (Math.random()*52);
            temp = korttipakka[vaihdaA];
            korttipakka[vaihdaA] = korttipakka[vaihdaB];
            korttipakka[vaihdaB] = temp;
        }
        vuorossa = 1;
    }
    
    // Kirjoita metodi annaKortti()
    public Kortti annaKortti() {
    vuorossa++;
    return korttipakka[vuorossa-1];
}
public void shuffle() {
    Random rng = new Random();
    int n = 53;
    while (--n >= 1) {
        int k = rng.nextInt(n) + 1 ;  // 1 <= k < n (!)
        System.out.println("arvottu ind: " + k + " vaihdettava: " + n);
        Kortti temp = korttipakka[n];
        korttipakka[n] = korttipakka[k];
        korttipakka[k] = temp;
    }
		for (int i=1; i< 53; i++){
			System.out.println("shuffled indeksi: " 
					+ i + " " + korttipakka[i].toString());
		}
}
}
