import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Arrange (Setup)
        account = new BankAccount(1000);
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Teardown
        account = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(300);

        // Assert
        assertEquals(700, account.getBalance());
    }
}
