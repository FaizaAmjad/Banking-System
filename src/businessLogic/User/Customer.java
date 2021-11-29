package businessLogic.User;

import businessLogic.KYC;
import businessLogic.bankAccounts.CheckingAccount;
import businessLogic.bankAccounts.SavingsAccount;

public class Customer{

    private String personalNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String pinCode;
    private KYC kyc;
    private CheckingAccount accountList;
    private SavingsAccount savingsAccount;

    public Customer(String personalNumber, String firstName,String lastName, String email, String password, String telephone, String pinCode) {
        this.personalNumber = personalNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.pinCode = pinCode;
        this.kyc = new KYC("",0.0,false,false,false);
        this.accountList = new CheckingAccount("", 0.0);
    }
}









