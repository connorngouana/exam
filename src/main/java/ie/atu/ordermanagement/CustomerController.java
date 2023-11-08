package ie.atu.ordermanagement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController
{
    @PostMapping("/confirm")

    public String ConfirmOrder(@RequestBody Order order)
    {
        String confirmOrder = String.format("%s %s %s %s" , order.getCustomerId(), order.getName(), order.getAge(),order.getEmail());
        return confirmOrder;
}
}
