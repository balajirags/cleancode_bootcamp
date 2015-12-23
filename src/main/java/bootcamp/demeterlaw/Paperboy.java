package bootcamp.demeterlaw;

public class Paperboy {


    public static final int MONTHLY_PAYMENT_AMOUNT = 400;

    //violate law of demeter
    public void receivePayment(Customer customer) throws Exception {
        Wallet wallet = customer.getWallet();
        if(wallet.getTotalMoney() > MONTHLY_PAYMENT_AMOUNT){
            wallet.subtractMoney(MONTHLY_PAYMENT_AMOUNT);
        }else{
            throw new Exception("no money in wallet");
        }
    }
}
