diff --git a/xchange-examples/src/main/java/com/xeiam/xchange/examples/kraken/trading/MarketOrderDemo.java b/xchange-examples/src/main/java/com/xeiam/xchange/examples/kraken/trading/MarketOrderDemo.java
index 9f92fed..e77debd 100644
--- a/xchange-examples/src/main/java/com/xeiam/xchange/examples/kraken/trading/MarketOrderDemo.java
+++ b/xchange-examples/src/main/java/com/xeiam/xchange/examples/kraken/trading/MarketOrderDemo.java
@@ -48,7 +48,7 @@
     String tradableIdentifier = "BTC";
     String transactionCurrency = "EUR";
 
-    MarketOrder marketOrder = new MarketOrder(orderType, tradeableAmount, tradableIdentifier, transactionCurrency, "", null);
+    MarketOrder marketOrder = new MarketOrder(orderType, tradeableAmount, tradableIdentifier, transactionCurrency);
 
     String orderID = tradeService.placeMarketOrder(marketOrder);
     System.out.println("Market Order ID: " + orderID);
