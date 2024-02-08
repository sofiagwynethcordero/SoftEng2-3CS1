public class OrderDemo{
    public static void main(String[] args){

        Order order =new Order (12000.00, new Maya());

        System.out.println(order.calculatePayment());
    }
}