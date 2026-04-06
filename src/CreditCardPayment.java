 class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("paid using credit card: "+ amount);
    }

 }

 class mainclass {
     public static void main (String [] args){
         CreditCardPayment payment = new CreditCardPayment();
         payment.pay(7.000);
         System.out.println(payment);
     }
 }
