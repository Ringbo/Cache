diff --git a/xchange-coinbase/src/main/java/org/knowm/xchange/coinbase/service/polling/CoinbaseTradeService.java b/xchange-coinbase/src/main/java/org/knowm/xchange/coinbase/service/polling/CoinbaseTradeService.java
index 7238fdc..b42ec36 100644
--- a/xchange-coinbase/src/main/java/org/knowm/xchange/coinbase/service/polling/CoinbaseTradeService.java
+++ b/xchange-coinbase/src/main/java/org/knowm/xchange/coinbase/service/polling/CoinbaseTradeService.java
@@ -47,7 +47,7 @@
 
     final CoinbaseTransfer transfer = marketOrder.getType().equals(OrderType.BID) ? super.buy(marketOrder.getTradableAmount())
         : super.sell(marketOrder.getTradableAmount());
-    return transfer.getTransactionId();
+    return transfer.getId();
   }
 
   @Override
