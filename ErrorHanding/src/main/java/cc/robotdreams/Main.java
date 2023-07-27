package cc.robotdreams;

import cc.robotdreams.exceptions.WrongAccountException;
import cc.robotdreams.exceptions.WrongCurrencyException;
import cc.robotdreams.exceptions.WrongOperationException;
import cc.robotdreams.exceptions.WrongProcessingException;


public class Main {
    // Initialize the BankApplication object
    private static BankApplication bankApp;

    public static void main(String[] args) {
        // Initialize the BankApplication object
        bankApp = new BankApplication();

        processWrapper("accountId000", 50, "USD"); // This account does not exist
        processWrapper("accountId003", 250, "HRV"); // Successful
        processWrapper("accountId001", 50, "EUR"); // This account has another currency
        processWrapper("accountId001", 49, "USD"); // The account does not have enough funds
        processWrapper("accountId001", 2000, "USD"); // Thank you for using our service ;)
    }


    // Метод processWrapper(String, int, String)
    private static void processWrapper(String accountId, int amount, String currency) {
        try {
            bankApp.process(accountId, amount, currency);
        } catch (WrongAccountException | WrongCurrencyException | WrongProcessingException |
                 WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown issue, please call the hotline back 8 800 210 00 01");
        } finally {
            System.out.println("Thank you for using our service ;)\n");
        }
    }

}
