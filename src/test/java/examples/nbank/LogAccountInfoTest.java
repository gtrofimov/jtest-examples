package examples.nbank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;


/**
 * Parasoft Jtest UTA: Test class for LogAccountInfo
 *
 * @see LogAccountInfo
 * @author gtrofimov
 */
public class LogAccountInfoTest {
    /**
     * Parasoft Jtest UTA: Test for log(Account)
     *
     * @author gtrofimov
     * @see LogAccountInfo#log(Account)
     */
    @Test
    public void testLog() throws Throwable {
        // Given
        LogAccountInfo underTest = new LogAccountInfo();

        // When
        Account account = mock(Account.class);
        boolean result = underTest.log(account);

        // Then - assertions for result of method log(Account)
        assertTrue(result);

    }
}