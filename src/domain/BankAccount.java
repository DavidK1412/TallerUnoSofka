package domain;

/**
 * Represents a bank account.
 * @author David
 */

public class BankAccount {
    // Attributes
    /**
     * The account number.
     */
    private int accountNumber;
    /**
     * Verifies if the account is active. if it is active, it can be used.
     */
    protected boolean active;

    /**
     * Constructor.
     * @param accountNumber The account number.
     */
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.active = true;
    }


    /**
     * Set the status of the account.
     */
    public void setActived(boolean active) {
        this.active = active;
    }

    /**
     * Returns the account status.
     * @return True if the account is active, false if it is not.
     */

    public boolean getActived() {
        return active;
    }
}
