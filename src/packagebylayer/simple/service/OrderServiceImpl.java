package packagebylayer.simple.service;

import packagebyfeature.orders.OrdersRepository;

public class OrderServiceImpl implements OrdersService {
    private OrdersRepository ordersRepository;

    public OrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void getOrders() {
        ordersRepository.readOrders();
    }
}
