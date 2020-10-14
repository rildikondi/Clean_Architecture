package portsandadapters.domain;

public class OrderServiceImpl implements OrdersService {
    private Orders orders;

    public OrderServiceImpl(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void getOrders() {
        orders.readOrders();
    }
}
