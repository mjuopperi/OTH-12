package pokerikadet;

public class Kortti implements Comparable<Kortti> {

    // Näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista tähän tapaan Kortti.HERTTA
    final static String[] MAAT = {"Hertta", "Ruutu", "Risti", "Pata"};
    final static int HERTTA = 0, RUUTU = 1, RISTI = 2, PATA = 3;
    // Esittele instanssimuuttujat
    private int arvo;
    private int maa;

    // Kirjoita kahden parametrin konstruktori 
    public Kortti(int maa, int arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }

    // Kirjoita getterit
    public int getArvo() {
        return arvo;
    }

    public int getMaa() {
        return maa;
    }

    // Kirjoita toString()
    @Override
    public String toString() {
        return MAAT[maa] + " " + getArvo();
    }
    
  @Override 
  public int compareTo(Kortti aThat) {   
      if (this.getArvo() < aThat.getArvo()) {
          return -1;
      }
      else if (this.getArvo() > aThat.getArvo()) {
          return 1;
      }
      else return 0;
  }
}
