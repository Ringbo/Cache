diff --git a/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java b/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
index f7415fb..b26fd31 100644
--- a/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
+++ b/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
@@ -60,7 +60,7 @@
   public static OrderBook adaptOrderBook(BitfinexDepth btceDepth, CurrencyPair currencyPair) {
 
     OrdersContainer asksOrdersContainer = adaptOrders(btceDepth.getAsks(), currencyPair, OrderType.ASK);
-    OrdersContainer bidsOrdersContainer = adaptOrders(btceDepth.getAsks(), currencyPair, OrderType.BID);
+    OrdersContainer bidsOrdersContainer = adaptOrders(btceDepth.getBids(), currencyPair, OrderType.BID);
 
     return new OrderBook(new Date(Math.max(asksOrdersContainer.getTimestamp(), bidsOrdersContainer.getTimestamp())), asksOrdersContainer.getLimitOrders(), bidsOrdersContainer.getLimitOrders());
   }
