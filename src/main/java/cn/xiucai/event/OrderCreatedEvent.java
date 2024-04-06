package cn.xiucai.event;


import org.springframework.context.ApplicationEvent;

/**
 * @author zhangxiulin
 * @date 2024/4/6 10:43
 * @description 领域事件类
 */
public class OrderCreatedEvent extends ApplicationEvent {
    private String orderId;

    public OrderCreatedEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
