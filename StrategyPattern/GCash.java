public class GCash implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Gcash is yout payment type!\n" +
                  "You earned 10 energy point!";

        return output;
    }
}