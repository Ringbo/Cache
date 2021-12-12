diff --git a/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceAdapters.java b/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceAdapters.java
index fb27f26..d44ab35 100644
--- a/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceAdapters.java
+++ b/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceAdapters.java
@@ -137,7 +137,8 @@
               order.executedQty,
               BigDecimal.ZERO,
               orderStatus);
-    } else if (order.type.equals(org.knowm.xchange.binance.dto.trade.OrderType.LIMIT)) {
+    } else if (order.type.equals(org.knowm.xchange.binance.dto.trade.OrderType.LIMIT)
+        || order.type.equals(org.knowm.xchange.binance.dto.trade.OrderType.LIMIT_MAKER)) {
       result =
           new LimitOrder(
               type,
