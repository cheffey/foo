package app.orderservice.api.fulfillment;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class SearchFulfillmentResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "fulfillments")
    public List<FulfillmentView> fulfillments;

    public static class Fulfillment {
        @Property(name = "id")
        public String id;

        @Property(name = "status")
        public String status;
    }
}