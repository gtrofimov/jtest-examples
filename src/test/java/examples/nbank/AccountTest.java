package examples.nbank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;


/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see Account
 * @author gtrofimov
 */
public class AccountTest
{
    /**
     * Parasoft Jtest UTA: Test for apply(ITransaction)
     *
     * @author gtrofimov
     * @see Account#apply(ITransaction)
     */
    @Test
    public void testApply() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        ITransaction transaction = mock(ITransaction.class);
        underTest.apply(transaction);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for getBalance()
     *
     * @author gtrofimov
     * @see Account#getBalance()
     */
    @Test
    public void testGetBalance() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        int result = underTest.getBalance();

        // Then - assertions for result of method getBalance()
        assertEquals(1000, result);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for getCustomer()
     *
     * @author gtrofimov
     * @see Account#getCustomer()
     */
    @Test
    public void testGetCustomer() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        Customer result = underTest.getCustomer();

        // Then - assertions for result of method getCustomer()
        assertAll(() -> {
            assertNotNull(result);
        }, () -> {
            assertEquals("john", result.toStrng());
        }, () -> {
            assertEquals("123-45-6789", result.getSSN());
        });

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertEquals(1000, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for getID()
     *
     * @author gtrofimov
     * @see Account#getID()
     */
    @Test
    public void testGetID() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        String result = underTest.getID();

        // Then - assertions for result of method getID()
        assertEquals("123-45-6789", result);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for getStatus()
     *
     * @author gtrofimov
     * @see Account#getStatus()
     */
    @Test
    public void testGetStatus() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        String result = underTest.getStatus();

        // Then - assertions for result of method getStatus()
        assertEquals("silver", result);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, underTest.getBalance());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for isOverdrawn(int)
     *
     * @author gtrofimov
     * @see Account#isOverdrawn(int)
     */
    @Test
    public void testIsOverdrawn() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        int balance = 0; // UTA: default value
        boolean result = underTest.isOverdrawn(balance);

        // Then - assertions for result of method isOverdrawn(int)
        assertFalse(result);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
     *
     * @author gtrofimov
     * @see Account#reportToCreditAgency(ICreditAgency)
     */
    @Test
    public void testReportToCreditAgency() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        ICreditAgency agency = mock(ICreditAgency.class);
        boolean result = underTest.reportToCreditAgency(agency);

        // Then - assertions for result of method reportToCreditAgency(ICreditAgency)
        assertFalse(result);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(1000, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }

    /**
     * Parasoft Jtest UTA: Test for setBalance(int)
     *
     * @author gtrofimov
     * @see Account#setBalance(int)
     */
    @Test
    public void testSetBalance() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // Given
        Customer customer = NbankFactory.createCustomer();
        Account underTest = NbankFactory.createAccount(customer);

        // When
        int balance = 0; // UTA: default value
        underTest.setBalance(balance);

        // Then - assertions for this instance of Account
        assertAll(() -> {
            assertNotNull(underTest.getCustomer());
        }, () -> {
            assertEquals("john", underTest.getCustomer().toStrng());
        }, () -> {
            assertEquals("123-45-6789", underTest.getCustomer().getSSN());
        }, () -> {
            assertEquals(0, underTest.getBalance());
        }, () -> {
            assertEquals("silver", underTest.getStatus());
        });

    }
}