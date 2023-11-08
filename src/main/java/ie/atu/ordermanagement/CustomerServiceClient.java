package ie.atu.ordermanagement;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service@FeignClient(name = "Order Service" , url = "http://localhost:8081" )
public interface CustomerServiceClient
{
    @PostMapping("/confirm")
    String getCustomerId(@RequestBody Order order);

}
