package portsandadapters.web;

import portsandadapters.domain.OrdersService;

public class OrdersController {
    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
}
