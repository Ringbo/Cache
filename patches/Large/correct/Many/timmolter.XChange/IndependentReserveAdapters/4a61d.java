diff --git a/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/IndependentReserveAdapters.java b/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/IndependentReserveAdapters.java
index 8052117..80ea62b 100644
--- a/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/IndependentReserveAdapters.java
+++ b/xchange-independentreserve/src/main/java/com/xeiam/xchange/independentreserve/IndependentReserveAdapters.java
@@ -32,7 +32,7 @@
         List<LimitOrder> bids = adaptOrders(independentReserveOrderBook.getBuyOrders(),
                 Order.OrderType.BID,
                 new CurrencyPair(independentReserveOrderBook.getPrimaryCurrencyCode(), independentReserveOrderBook.getSecondaryCurrencyCode()));
-        List<LimitOrder> asks = adaptOrders(independentReserveOrderBook.getBuyOrders(),
+        List<LimitOrder> asks = adaptOrders(independentReserveOrderBook.getSellOrders(),
                 Order.OrderType.ASK,
                 new CurrencyPair(independentReserveOrderBook.getPrimaryCurrencyCode(), independentReserveOrderBook.getSecondaryCurrencyCode()));
         Date timestamp = new Date(independentReserveOrderBook.getCreatedTimestampUtc());
