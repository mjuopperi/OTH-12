package pokerikadet;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author hakka, 2.2.2013
 */
public class PakkaTest {

    /**
     * Test of annaKortti method, of class Pakka /** Test of annaKortti method,
     * of class Pakka Test of sekoita method, of class Pakka.
     */
    @Test
    public void testAnnaKortti() {
        Pakka instance = new Pakka();
        Kortti kortti;
        String expected;

        // Vedä sekoittamattomasta pakasta 52 korttia
        System.out.println("--- PakkaTest: annaKortti");
        System.out.println("Kortit sekoittamatta: ");
        for (int maa = Kortti.HERTTA; maa <= Kortti.PATA; maa++) {
            for (int numero = 1; numero <= 13; numero++) {
                kortti = instance.annaKortti();
                System.out.println(kortti);
                expected = Kortti.MAAT[maa] + " " + numero;
                assertEquals(expected, kortti.toString());
            }
        }
    }
    /*
     * Test of sekoita method, of class Pakka.
     */

    @Test
    public void testSekoita() {

        // Vedä sekoitetusta pakasta kortteja ja tulosta
        System.out.println("--- PakkaTest: sekoita");
        Pakka instance = new Pakka();
        instance.sekoita();
        System.out.println("Kortit sekoitettuna:");
        for (int i = 1; i <= Pakka.KORTTILKM; i++) {
            System.out.println(i + ": " + instance.annaKortti());
        }
        System.out.println("Varmista itse outputista, että kortit sekoittuneet.");
        fail("Varmista itse outputista, että kortit ovat sekoittuneet.");
    }

}
