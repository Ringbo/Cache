diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/trade/DSXTradeDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/trade/DSXTradeDemo.java
index b84c1a7..39116e5 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/trade/DSXTradeDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/trade/DSXTradeDemo.java
@@ -62,7 +62,7 @@
 
     DSXOrder.Type type = DSXOrder.Type.buy;
     String pair = "btcusd";
-    DSXOrder dsxOrder = new DSXOrder(pair, type, new BigDecimal("0.01"), new BigDecimal("900"), new Date().getTime(), 0, DSXOrder.OrderType.limit);
+    DSXOrder dsxOrder = new DSXOrder(pair, type, new BigDecimal("0.01"), new BigDecimal("900"),0, DSXOrder.OrderType.limit);
 
     DSXTradeResult result = null;
     DSXTradeResult result1 = null;
@@ -100,7 +100,7 @@
     // place buy order
     DSXOrder.Type type = DSXOrder.Type.buy;
     String pair = "btcusd";
-    DSXOrder dsxOrder = new DSXOrder(pair, type, new BigDecimal("0.1"), new BigDecimal("900"), new Date().getTime(), 0, DSXOrder.OrderType.limit);
+    DSXOrder dsxOrder = new DSXOrder(pair, type, new BigDecimal("0.1"), new BigDecimal("900"),0, DSXOrder.OrderType.limit);
 
     DSXTradeResult result = null;
     try {
