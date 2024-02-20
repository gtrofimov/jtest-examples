package examples.nbank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * Parasoft Jtest UTA: Test class for BankState
 *
 * @see BankState
 * @author gtrofimov
 */
public class BankStateTest
{
    /**
     * Parasoft Jtest UTA: Test for endMaintenance()
     *
     * @author gtrofimov
     * @see BankState#endMaintenance()
     */
    @Test
    public void testEndMaintenance() throws Throwable {
        // When
        BankState.endMaintenance();

    }

    /**
     * Parasoft Jtest UTA: Test for isMaintenanceMode()
     *
     * @author gtrofimov
     * @see BankState#isMaintenanceMode()
     */
    @Test
    public void testIsMaintenanceMode() throws Throwable {
        // UTA is unable to resolve the values required to create the requested test case.
        // A test case with default values has been created instead.

        // When
        Boolean result = BankState.isMaintenanceMode();

        // Then - assertions for result of method isMaintenanceMode()
        assertNotNull(result);
        assertFalse(result);

    }

    /**
     * Parasoft Jtest UTA: Test for startMaintenance()
     *
     * @author gtrofimov
     * @see BankState#startMaintenance()
     */
    @Test
    public void testStartMaintenance() throws Throwable {
        // When
        BankState.startMaintenance();

    }

}