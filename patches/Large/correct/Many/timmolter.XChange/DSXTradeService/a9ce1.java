diff --git a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXTradeService.java b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXTradeService.java
index 256ed4e..96d1934 100644
--- a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXTradeService.java
+++ b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXTradeService.java
@@ -83,7 +83,7 @@
 
     String pair = DSXAdapters.getPair(limitOrder.getCurrencyPair());
 
-    DSXOrder dsxOrder = new DSXOrder(pair, type, limitOrder.getTradableAmount(), limitOrder.getLimitPrice(),
+    DSXOrder dsxOrder = new DSXOrder(pair, type, limitOrder.getOriginalAmount(), limitOrder.getLimitPrice(),
         3, DSXOrder.OrderType.limit);
 
     DSXTradeResult result = tradeDSX(dsxOrder);
