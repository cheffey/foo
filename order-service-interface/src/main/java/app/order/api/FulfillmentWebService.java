package app.order.api;

import app.order.api.fulfillment.CreateFulfillmentRequest;
import app.order.api.fulfillment.CreateFulfillmentResponse;
import app.order.api.fulfillment.FulfillmentStatusResponse;
import app.order.api.fulfillment.GetFulfillmentResponse;
import app.order.api.fulfillment.SearchFulfillmentRequest;
import app.order.api.fulfillment.SearchFulfillmentResponse;
import app.order.api.fulfillment.CancelFulfillmentResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author: Cheffey
 */
public interface FulfillmentWebService {
    @GET
    @Path("/fulfillment/:id")
    GetFulfillmentResponse get(@PathParam("id") String id);

    @PUT
    @Path("/fulfillment/:id/cancel")
    CancelFulfillmentResponse cancel(@PathParam("id") String id);

    @PUT
    @Path("/fulfillment")
    SearchFulfillmentResponse search(SearchFulfillmentRequest request);

    @POST
    @Path("/fulfillment")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateFulfillmentResponse create(CreateFulfillmentRequest request);

    @GET
    @Path("/fulfillment/:id/status")
    FulfillmentStatusResponse getStatus(@PathParam("id") String id);

}
