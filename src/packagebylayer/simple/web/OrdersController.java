package packagebylayer.simple.web;

import packagebyfeature.orders.OrdersService;

public class OrdersController {
    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
}
