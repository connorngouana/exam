package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
    private OrderService orderService;
    private CustomerService customerService;

    @Autowired
    public OrderController (OrderService orderService , CustomerService customerService)
    {
        this.customerService = customerService;
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public String Orders(@RequestBody Order order)
        {
            String confirm_orders = orderService.createOrder(order);
            return confirm_orders;
        }

        @PostMapping("/orders")
    public String Customer(@RequestBody Order order)
    {
        if(order.getAge() > 18)
        {
            String confirm_orders = customerService.getCustomerId(order);
            return confirm_orders;
        }
        else
        {
            String message = String.format ("The user " + order.getName() + "is too young");
            return message;
        }

    }


}
