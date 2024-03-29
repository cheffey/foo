package app.order.api;

import app.order.api.order.BOCreateOrderAJAXRequest;
import app.order.api.order.BOCreateOrderAJAXResponse;
import app.order.api.order.BOGetOrderAJAXResponse;
import app.order.api.order.BOSearchOrderAJAXRequest;
import app.order.api.order.BOSearchOrderAJAXResponse;
import app.order.api.order.BOUpdateOrderAJAXRequest;
import app.order.api.order.BOUpdateOrderAJAXResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author: Cheffey
 */
public interface BOOrderAJAXWebService {
    @PUT
    @Path("/ajax/order/:id")
    BOUpdateOrderAJAXResponse update(@PathParam("id") String id, BOUpdateOrderAJAXRequest request);

    @PUT
    @Path("/ajax/order")
    BOSearchOrderAJAXResponse search(BOSearchOrderAJAXRequest request);

    @POST
    @Path("/ajax/order")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateOrderAJAXResponse create(BOCreateOrderAJAXRequest request);

    @GET
    @Path("/ajax/order/:id")
    BOGetOrderAJAXResponse get(@PathParam("id") String id);

    @DELETE
    @Path("/ajax/order/:id")
    void delete(@PathParam("id") String id);
}
