package app.order.order.web;

import app.order.api.OrderWebService;
import app.order.api.order.CancelOrderResponse;
import app.order.api.order.CreateOrderRequest;
import app.order.api.order.CreateOrderResponse;
import app.order.api.order.GetOrderResponse;
import app.order.api.order.OrderStatusResponse;
import app.order.api.order.SearchOrderRequest;
import app.order.api.order.SearchOrderResponse;
import app.order.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author: Cheffey
 */
public class OrderWebServiceImpl implements OrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public GetOrderResponse get(String id) {
        return null;
    }

    @Override
    public CancelOrderResponse cancel(String id) {
        return null;
    }

    @Override
    public SearchOrderResponse search(SearchOrderRequest request) {
        return null;
    }

    @Override
    public CreateOrderResponse create(CreateOrderRequest request) {
        return null;
    }

    @Override
    public OrderStatusResponse getStatus(String id) {
        return null;
    }
}
