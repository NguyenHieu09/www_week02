package vn.edu.iuh.fit.backEnd.Services;

import vn.edu.iuh.fit.backEnd.models.Order;
import vn.edu.iuh.fit.backEnd.repositories.OrderRepository;

import java.util.List;

public class OrderServices {
    private final OrderRepository orderRepository;

    public OrderServices() {
        orderRepository = new OrderRepository();
    }

    public List<Order> getAll(){
        return orderRepository.getAll();
    }
}
