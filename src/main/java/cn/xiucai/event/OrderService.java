package cn.xiucai.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangxiulin
 * @date 2024/4/6 10:53
 * @description 订单服务
 */
@Slf4j
@Service
public class OrderService {
    @Resource
    private ApplicationEventPublisher publisher;

    public void createOrder(String orderId) {
        // 创建订单
        log.info("创建订单：{}", orderId);
        // 发布订单创建事件
        publisher.publishEvent(new OrderCreatedEvent(this, orderId));
    }
}
