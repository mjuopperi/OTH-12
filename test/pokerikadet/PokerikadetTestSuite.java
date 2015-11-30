
package pokerikadet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hakka, 2.2.2013
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    pokerikadet.KorttiTest.class,
    pokerikadet.PakkaTest.class, 
    pokerikadet.KäsiTest.class
    })

public class PokerikadetTestSuite {
    // JUnit 4:lle riittää tyhjä runko
}
