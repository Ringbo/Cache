diff --git a/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampTradeService.java b/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampTradeService.java
index c7e4b61..d4c5919 100644
--- a/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampTradeService.java
+++ b/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampTradeService.java
@@ -53,7 +53,7 @@
       BitstampOrder[] openOrders = getBitstampOpenOrders(pair);
       for (BitstampOrder bitstampOrder : openOrders) {
         OrderType orderType = bitstampOrder.getType() == 0 ? OrderType.BID : OrderType.ASK;
-        String id = Integer.toString(bitstampOrder.getId());
+        String id = Long.toString(bitstampOrder.getId());
         BigDecimal price = bitstampOrder.getPrice();
         limitOrders.add(
             new LimitOrder(
@@ -79,7 +79,7 @@
     if (bitstampOrder.getErrorMessage() != null) {
       throw new ExchangeException(bitstampOrder.getErrorMessage());
     }
-    return Integer.toString(bitstampOrder.getId());
+    return Long.toString(bitstampOrder.getId());
   }
 
   @Override
@@ -95,13 +95,13 @@
     if (bitstampOrder.getErrorMessage() != null) {
       throw new ExchangeException(bitstampOrder.getErrorMessage());
     }
-    return Integer.toString(bitstampOrder.getId());
+    return Long.toString(bitstampOrder.getId());
   }
 
   @Override
   public boolean cancelOrder(String orderId) throws IOException, BitstampException {
 
-    return cancelBitstampOrder(Integer.parseInt(orderId));
+    return cancelBitstampOrder(Long.parseLong(orderId));
   }
 
   @Override
