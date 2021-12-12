diff --git a/xchange-bittrex/src/main/java/com/xeiam/xchange/bittrex/v1/BittrexAdapters.java b/xchange-bittrex/src/main/java/com/xeiam/xchange/bittrex/v1/BittrexAdapters.java
index 5cf6cbe..328d3a5 100644
--- a/xchange-bittrex/src/main/java/com/xeiam/xchange/bittrex/v1/BittrexAdapters.java
+++ b/xchange-bittrex/src/main/java/com/xeiam/xchange/bittrex/v1/BittrexAdapters.java
@@ -154,7 +154,7 @@
 
     OrderType orderType = trade.getOrderType().equalsIgnoreCase("LIMIT_BUY") ? OrderType.BID : OrderType.ASK;
     BigDecimal amount = trade.getQuantity().subtract(trade.getQuantityRemaining());
-    BigDecimal price = trade.getPrice();
+    BigDecimal price = trade.getLimit();
     Date date = BittrexUtils.toDate(trade.getTimeStamp());
     String tradeId = String.valueOf(trade.getOrderUuid());
 
