package cn.xiucai.event;

public class OrderDto {
    private String orderId;
    // 可以根据需要添加其他属性，如商品列表、数量、买家信息等

    // Getters 和 Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // 如果有其他属性，也需要添加对应的getters和setters
}
