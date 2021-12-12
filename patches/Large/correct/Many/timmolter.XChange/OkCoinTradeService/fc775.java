diff --git a/xchange-okcoin/src/main/java/org/knowm/xchange/okcoin/service/OkCoinTradeService.java b/xchange-okcoin/src/main/java/org/knowm/xchange/okcoin/service/OkCoinTradeService.java
index aaba02d..6061b5d 100644
--- a/xchange-okcoin/src/main/java/org/knowm/xchange/okcoin/service/OkCoinTradeService.java
+++ b/xchange-okcoin/src/main/java/org/knowm/xchange/okcoin/service/OkCoinTradeService.java
@@ -108,7 +108,7 @@
 
   @Override
   public boolean cancelOrder(CancelOrderParams orderParams) throws IOException {
-    if (!(orderParams instanceof CancelOrderByIdParams) && !(orderParams instanceof CancelOrderByCurrencyPair)) {
+    if (!(orderParams instanceof CancelOrderByIdParams) || !(orderParams instanceof CancelOrderByCurrencyPair)) {
       throw new UnsupportedOperationException("Cancelling an order is only available for a single market and a single id.");
     }
     long id = Long.valueOf(((CancelOrderByIdParams) orderParams).getOrderId());
