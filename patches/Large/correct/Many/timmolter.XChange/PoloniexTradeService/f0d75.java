diff --git a/xchange-poloniex/src/main/java/org/knowm/xchange/poloniex/service/PoloniexTradeService.java b/xchange-poloniex/src/main/java/org/knowm/xchange/poloniex/service/PoloniexTradeService.java
index d68fc0e..48db4a1 100644
--- a/xchange-poloniex/src/main/java/org/knowm/xchange/poloniex/service/PoloniexTradeService.java
+++ b/xchange-poloniex/src/main/java/org/knowm/xchange/poloniex/service/PoloniexTradeService.java
@@ -78,7 +78,7 @@
   public String placeLimitOrder(LimitOrder limitOrder) throws IOException {
 
     PoloniexTradeResponse response;
-    if (limitOrder.getType() == OrderType.BID) {
+    if (limitOrder.getType() == OrderType.BID || limitOrder.getType() == OrderType.EXIT_ASK) {
       response = buy(limitOrder);
     } else {
       response = sell(limitOrder);
