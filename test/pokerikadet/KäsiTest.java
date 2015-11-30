package pokerikadet;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author hakka, 2.2.2013
 */
public class KäsiTest {

    Kortti[] kortit = new Kortti[5];
    Käsi instance;

    // Tämä metodi suoriteetaan aine ennen kutakin testimetodia.
    // Kaikissa testeissä on siis lähtötilanteena sama Käsi. 
    @Before
    public void oletusKäsi() {
        System.out.println("Testi alkaa.");
        kortit[0] = new Kortti(Kortti.HERTTA, 1);
        kortit[1] = new Kortti(Kortti.HERTTA, 3);
        kortit[2] = new Kortti(Kortti.HERTTA, 5);
        kortit[3] = new Kortti(Kortti.HERTTA, 7);
        kortit[4] = new Kortti(Kortti.HERTTA, 9);
    }

    // Tämä metodi suoritetaan aina kunkin testimetodin jälkeen.
    // Metodi tulostaa tarkastetun Käden.
    @After
    public void tulostaKäsi() {
        System.out.println("Mitä testattiin: " + instance);
    }

    /**
     * Tests of annaArvo method, of class Käsi
     * 
     */
    @Test
    public void testEiVäri() {
        // Muistettava testata myös se toinen vaihtoehto
        System.out.println("--- KäsiTest: annaArvo -> EI VÄRI");
        kortit[0] = new Kortti(Kortti.PATA, 13);
        instance = new Käsi(kortit);
        assertEquals("Ei saanut tulla VÄRI", Käsi.EIVÄRI, instance.annaArvo());
    }

    @Test
    public void testVäri() {
        System.out.println("--- KäsiTest: annaArvo -> VÄRI");
        instance = new Käsi(kortit);
        assertEquals("Piti tulla VÄRI", Käsi.VÄRI, instance.annaArvo());
    }

   // @Ignore
    @Test
    public void testEiSuora() {
        System.out.println("--- KäsiTest: annaArvo -> EI SUORA");
        kortit[0] = new Kortti(Kortti.PATA, 13);
        instance = new Käsi(kortit);
        assertEquals("Ei saanut tulla SUORA", Käsi.EISUORA, instance.annaArvo());
    }
  // @Ignore
    @Test
    public void testEi2Suora() {
        System.out.println("--- KäsiTest: annaArvo -> EI SUORA, samaa arvoa");
         kortit[0] = new Kortti(Kortti.HERTTA, 2);
        kortit[1] = new Kortti(Kortti.HERTTA, 3);
        kortit[2] = new Kortti(Kortti.PATA, 3);
        kortit[3] = new Kortti(Kortti.HERTTA, 5);
        kortit[4] = new Kortti(Kortti.HERTTA, 6);
        instance = new Käsi(kortit);
        assertEquals("Ei saanut tulla SUORA", Käsi.EISUORA, instance.annaArvo());
    }
   // @Ignore
    @Test
    public void testSuora() {
        System.out.println("--- KäsiTest: annaArvo -> SUORA");
        kortit[0] = new Kortti(Kortti.HERTTA, 1);
        kortit[1] = new Kortti(Kortti.RUUTU, 2);
        kortit[2] = new Kortti(Kortti.RISTI, 3);
        kortit[3] = new Kortti(Kortti.PATA, 4);
        kortit[4] = new Kortti(Kortti.HERTTA, 5);
        instance = new Käsi(kortit);
        assertEquals("Piti tulla SUORA (Ässä=1)", Käsi.SUORA, instance.annaArvo());
    }

   // @Ignore
    @Test
    public void testÄssäSuora() {
        System.out.println("--- KäsiTest: annaArvo -> SUORA");
        kortit[0] = new Kortti(Kortti.HERTTA, 1);
        kortit[1] = new Kortti(Kortti.RUUTU, 10);
        kortit[2] = new Kortti(Kortti.RISTI, 11);
        kortit[3] = new Kortti(Kortti.PATA, 12);
        kortit[4] = new Kortti(Kortti.HERTTA, 13);

        instance = new Käsi(kortit);
        assertEquals("Piti tulla SUORA (Ässä=14)", Käsi.SUORA, instance.annaArvo());
    }

  //  @Ignore
    @Test
    public void testEiVäriSuora() {
        System.out.println("--- KäsiTest: annaArvo -> EI VÄRISUORA");
        kortit[0] = new Kortti(Kortti.PATA, 13);
        instance = new Käsi(kortit);
        assertEquals("Ei saanut tulla VÄRISUORA", Käsi.EISUORA, instance.annaArvo());
    }

   // @Ignore
    @Test
    public void testVäriSuora() {
        System.out.println("--- KäsiTest: annaArvo -> VÄRISUORA");
        kortit[0] = new Kortti(Kortti.RUUTU, 3);
        kortit[1] = new Kortti(Kortti.RUUTU, 4);
        kortit[2] = new Kortti(Kortti.RUUTU, 5);
        kortit[3] = new Kortti(Kortti.RUUTU, 6);
        kortit[4] = new Kortti(Kortti.RUUTU, 7);
        instance = new Käsi(kortit);
        assertEquals("Piti tulla VÄRISUORA", Käsi.VÄRISUORA, instance.annaArvo());
    }

    /**
     * Test of toString method, of class Käsi.
     */
    @Test
    public void testToString() {
        System.out.println("--- KäsiTest: toString");
        Pakka pakka = new Pakka(); // Sekoittamaton
        instance = new Käsi(pakka);
        String expResult = "Hertta 1, Hertta 2, Hertta 3, Hertta 4, Hertta 5";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
