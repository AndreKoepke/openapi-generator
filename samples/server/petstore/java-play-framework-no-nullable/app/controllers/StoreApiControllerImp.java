package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class StoreApiControllerImp implements StoreApiControllerImpInterface {
    @Override
    public void deleteOrder(Request request, String orderId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Map<String, Integer> getInventory(Request request) throws Exception {
        //Do your magic!!!
        return new HashMap<String, Integer>();
    }

    @Override
    public Order getOrderById(Request request,  @Min(1) @Max(5)Long orderId) throws Exception {
        //Do your magic!!!
        return new Order();
    }

    @Override
    public Order placeOrder(Request request, Order body) throws Exception {
        //Do your magic!!!
        return new Order();
    }

}
