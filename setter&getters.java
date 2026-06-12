public class Bank{
    public static void main(String[] args){
        CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
        CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");
        System.out.println(accountOne.getBalance());
        accountOne.setBalance(5000);
        System.out.println(accountOne.getBalance());
    }
}
public class CheckingAccount{
    public String name;
    private int balance;
    private String id;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }
    public int getBalance(){ //getter
        return balance;
    }
    public void setBalance(int nb){ //setter or mutator
        balance=nb;
    }
}
