package packagebycomponent.orders;

public class OrderComponentImpl implements OrdersComponent {
    private OrdersRepository ordersRepository;

    public OrderComponentImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void getOrders() {
        ordersRepository.readOrders();
    }
}
