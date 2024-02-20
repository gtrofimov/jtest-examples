package examples.nbank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;


/**
 * Parasoft Jtest UTA: Test class for WithdrawalTransaction
 *
 * @see WithdrawalTransaction
 * @author gtrofimov
 */
public class WithdrawalTransactionTest
{
    /**
     * Parasoft Jtest UTA: Test for apply(Account)
     *
     * @author gtrofimov
     * @see WithdrawalTransaction#apply(Account)
     */
    @Test
    public void testApply() throws Throwable {
        // Given
        int amount = 0; // UTA: provided value
        WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

        // When
        Account account = mock(Account.class);
        boolean result = underTest.apply(account);

        // Then - assertions for result of method apply(Account)
        assertTrue(result);

    }

    /**
     * Parasoft Jtest UTA: Test for fee()
     *
     * @author gtrofimov
     * @see AbstractTransaction#fee()
     */
    @Test
    public void testFee() throws Throwable {
        // Given
        int amount = 0; // UTA: provided value
        WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

        // When
        int result = underTest.fee();

        // Then - assertions for result of method fee()
        assertEquals(0, result);

    }

    /**
     * Parasoft Jtest UTA: Test for apply(Account)
     *
     * @author gtrofimov
     * @see WithdrawalTransaction#apply(Account)
     */
    @Test
    public void testApply2() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        int amount = 0; // UTA: default value
        WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

        // When
        Customer customer = NbankFactory.createCustomer();
        Account account = NbankFactory.createAccount(customer);
        boolean result = underTest.apply(account);

        // Then - assertions for argument 1 of method apply(Account)
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

        // Then - assertions for result of method apply(Account)
        assertTrue(result);

    }

}