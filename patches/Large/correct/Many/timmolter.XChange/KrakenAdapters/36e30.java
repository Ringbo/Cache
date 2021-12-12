diff --git a/xchange-kraken/src/main/java/com/xeiam/xchange/kraken/KrakenAdapters.java b/xchange-kraken/src/main/java/com/xeiam/xchange/kraken/KrakenAdapters.java
index cb0dcc8..d257476 100644
--- a/xchange-kraken/src/main/java/com/xeiam/xchange/kraken/KrakenAdapters.java
+++ b/xchange-kraken/src/main/java/com/xeiam/xchange/kraken/KrakenAdapters.java
@@ -38,7 +38,7 @@
   public static OrderBook adaptOrderBook(KrakenDepth krakenDepth, CurrencyPair currencyPair) {
 
     OrdersContainer asksOrdersContainer = adaptOrders(krakenDepth.getAsks(), currencyPair, OrderType.ASK);
-    OrdersContainer bidsOrdersContainer = adaptOrders(krakenDepth.getAsks(), currencyPair, OrderType.BID);
+    OrdersContainer bidsOrdersContainer = adaptOrders(krakenDepth.getBids(), currencyPair, OrderType.BID);
 
     return new OrderBook(new Date(Math.max(asksOrdersContainer.getTimestamp(), bidsOrdersContainer.getTimestamp())), asksOrdersContainer.getLimitOrders(), bidsOrdersContainer.getLimitOrders());
   }
