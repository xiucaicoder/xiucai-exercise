package cn.xiucai.event;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangxiulin
 * @date 2024/4/6 11:03
 * @description 订单控制器

 */
@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/createOrder")
    @ResponseBody
    public String createOrder(@RequestBody OrderDto orderDto) {
        orderService.createOrder(orderDto.getOrderId());

        return "订单创建流程触发啦";
    }
}
