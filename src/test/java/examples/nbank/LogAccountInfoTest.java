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
public class LogAccountInfoTest
{
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

    /**
     * Parasoft Jtest UTA: Test for log(Account)
     *
     * @author gtrofimov
     * @see LogAccountInfo#log(Account)
     */
    @Test
    public void testLog2() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        LogAccountInfo underTest = new LogAccountInfo();

        // When
        Customer customer = NbankFactory.createCustomer();
        Account account = NbankFactory.createAccount(customer);
        boolean result = underTest.log(account);

        // Then - assertions for argument 1 of method log(Account)
        assertAll(() -> {
            assertNotNull(account.getCustomer());
        }, () -> {
            assertEquals("john", account.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", account.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, account.getBalance());
        }, () -> {
            assertEquals("silver", account.getStatus());
        });

        // Then - assertions for result of method log(Account)
        assertTrue(result);

    }
}