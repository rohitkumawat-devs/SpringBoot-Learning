package in.coderarmy;

import in.coderarmy.payment.PaymentService;

public class OrderService {

    private PaymentService paymentService;

    // by using constructor
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    // by using setter
//    public void setPaymentServiceBean(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
