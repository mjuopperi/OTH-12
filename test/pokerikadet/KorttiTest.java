package pokerikadet;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hakka, 2.2.2013
 */
public class KorttiTest {

    /**
     * Test of toString method, of class Kortti.
     */
    @Test
    public void testToString() {
        System.out.println("--- KorttiTest: Konstuktorit, getterit ja setterit\n"
                + "eivät tarvitse yleensä erikseen omia testimetodeja.\n"
                + "Ne tulevat lähes aina testattua muiden metodien testien\n"
                + "yhteydessä.");
        System.out.println("--- KorttiTest: toString");

        Kortti instance = new Kortti(Kortti.HERTTA, 12); // Herttanen rouva   
        String result = instance.toString();
        assertEquals("Hertta 12", result);
    }
}
