package packagebyfeature.orders;

public class OrdersController {
    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
}
