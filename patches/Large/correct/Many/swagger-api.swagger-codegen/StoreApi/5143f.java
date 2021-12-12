diff --git a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/StoreApi.java b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/StoreApi.java
index ffa77a6..194e30d 100644
--- a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/StoreApi.java
+++ b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/StoreApi.java
@@ -24,7 +24,7 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
         @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
-    void deleteOrder(@PathParam("order_id") @ApiParam("ID of the order that needs to be deleted") String orderId);
+    void deleteOrder(@PathParam("order_id") @ApiParam("ID of the order that needs to be deleted") String orderId) throws Exception;
 
     @GET
     @Path("/inventory")
@@ -34,7 +34,7 @@
     }, tags={ "store",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
-    Map<Map<String, Integer>> getInventory();
+    Map<String, Integer> getInventory() throws Exception;
 
     @GET
     @Path("/order/{order_id}")
@@ -44,7 +44,7 @@
         @ApiResponse(code = 200, message = "successful operation", response = Order.class),
         @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
         @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
-    Order getOrderById(@PathParam("order_id") @Min(1) @Max(5) @ApiParam("ID of pet that needs to be fetched") Long orderId);
+    Order getOrderById(@PathParam("order_id") @Min(1) @Max(5) @ApiParam("ID of pet that needs to be fetched") Long orderId) throws Exception;
 
     @POST
     @Path("/order")
@@ -53,5 +53,5 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Order.class),
         @ApiResponse(code = 400, message = "Invalid Order", response = Void.class) })
-    Order placeOrder(@Valid Order body);
+    Order placeOrder(@Valid Order body) throws Exception;
 }
