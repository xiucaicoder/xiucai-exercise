package cn.xiucai.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangxiulin
 * @date 2024/4/6 10:48
 * @description 事件监听类来处理事件
 */
@Slf4j
@Component
public class OrderCreatedEventListener {
    @EventListener
    public void onOrderCreated(OrderCreatedEvent event) {
        log.info("订单创建事件监听器监听到事件：{}", event);
    }
}
