diff --git a/xchange-gatecoin/src/main/java/com/xeiam/xchange/gatecoin/service/polling/GatecoinTradeService.java b/xchange-gatecoin/src/main/java/com/xeiam/xchange/gatecoin/service/polling/GatecoinTradeService.java
index cfd700e..98791c7 100644
--- a/xchange-gatecoin/src/main/java/com/xeiam/xchange/gatecoin/service/polling/GatecoinTradeService.java
+++ b/xchange-gatecoin/src/main/java/com/xeiam/xchange/gatecoin/service/polling/GatecoinTradeService.java
@@ -52,7 +52,8 @@
 
         List<LimitOrder> limitOrders = new ArrayList<LimitOrder>();
         for (GatecoinOrder gatecoinOrder : openOrdersResult.getOrders()) {
-            OrderType orderType = gatecoinOrder.getType() == 0 ? OrderType.BID : OrderType.ASK;
+            /* get side is order side (ask or bid) get type is order type, (limit or market) */
+            OrderType orderType = gatecoinOrder.getSide() == 0 ? OrderType.BID : OrderType.ASK;
             String id = gatecoinOrder.getClOrderId();
             BigDecimal price = gatecoinOrder.getPrice();
             CurrencyPair ccyPair = new CurrencyPair(gatecoinOrder.getCode().substring(0, 3), gatecoinOrder.getCode().substring(3, 6));
