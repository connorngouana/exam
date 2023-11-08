package ie.atu.ordermanagement;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class Order_Service
{
    public  String createOrder(Order order)
    {
        String Orders = order.getOrderId() + order.getProductId() + order.getQuantity() + order.getCustomerId();
        return Orders;

    }



}
