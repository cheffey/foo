package app.orderservice.api.fulfillment;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author: Cheffey
 */
public class UpdateFulfillmentResponse {
    @Property(name = "id")
    public String id;

    @Property(name="items")
    public List<String> items;

    @Property(name="status")
    public String status;
}