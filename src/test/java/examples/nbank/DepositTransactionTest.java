package examples.nbank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Parasoft Jtest UTA: Test class for DepositTransaction
 *
 * @see DepositTransaction
 * @author gtrofimov
 */
public class DepositTransactionTest
{
    /**
     * Parasoft Jtest UTA: Test for apply(Account)
     *
     * @author gtrofimov
     * @see DepositTransaction#apply(Account)
     */
    @Test
    public void testApply() throws Throwable {
        // Given
        int amount = 0; // UTA: default value
        DepositTransaction underTest = new DepositTransaction(amount);

        // When
        Account account = mock(Account.class);
        Customer getCustomerResult = mock(Customer.class);
        String getNameResult = ""; // UTA: provided value
        when(getCustomerResult.getName()).thenReturn(getNameResult);
        when(account.getCustomer()).thenReturn(getCustomerResult);
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
        int amount = 0; // UTA: default value
        DepositTransaction underTest = new DepositTransaction(amount);

        // When
        int result = underTest.fee();

        // Then - assertions for result of method fee()
        assertEquals(0, result);

    }

}