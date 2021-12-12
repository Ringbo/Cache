diff --git a/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceExchange.java b/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceExchange.java
index 142934f..3888050 100644
--- a/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceExchange.java
+++ b/xchange-binance/src/main/java/org/knowm/xchange/binance/BinanceExchange.java
@@ -104,7 +104,7 @@
 
             for (Filter filter : filters) {
               if (filter.getFilterType().equals("PRICE_FILTER")) {
-                pairPrecision = Math.min(pairPrecision, numberOfDecimals(filter.getMinPrice()));
+                pairPrecision = Math.min(pairPrecision, numberOfDecimals(filter.getTickSize()));
               } else if (filter.getFilterType().equals("LOT_SIZE")) {
                 amountPrecision = Math.min(amountPrecision, numberOfDecimals(filter.getMinQty()));
                 minQty = new BigDecimal(filter.getMinQty()).stripTrailingZeros();
