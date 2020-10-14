package packagebycomponent.web;

import packagebycomponent.orders.OrdersComponent;

public class OrdersController {
    private OrdersComponent ordersComponent;

    public OrdersController(OrdersComponent ordersComponent) {
        this.ordersComponent = ordersComponent;
    }
}
