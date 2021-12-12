diff --git a/xchange-bitmarket/src/main/java/com/xeiam/xchange/bitmarket/service/polling/BitMarketDataServiceRaw.java b/xchange-bitmarket/src/main/java/com/xeiam/xchange/bitmarket/service/polling/BitMarketDataServiceRaw.java
index 230c578..53aa7ec 100644
--- a/xchange-bitmarket/src/main/java/com/xeiam/xchange/bitmarket/service/polling/BitMarketDataServiceRaw.java
+++ b/xchange-bitmarket/src/main/java/com/xeiam/xchange/bitmarket/service/polling/BitMarketDataServiceRaw.java
@@ -24,17 +24,17 @@
 
   public BitMarketTicker getBitMarketTicker(CurrencyPair currencyPair) throws IOException {
 
-    return bitMarket.getTicker(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toString());
+    return bitMarket.getTicker(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toUpperCase());
   }
 
   public BitMarketOrderBook getBitMarketOrderBook(CurrencyPair currencyPair) throws IOException {
 
-    return bitMarket.getOrderBook(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toString());
+    return bitMarket.getOrderBook(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toUpperCase());
   }
 
   public BitMarketTrade[] getBitMarketTrades(CurrencyPair currencyPair) throws IOException {
 
-    return bitMarket.getTrades(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toString());
+    return bitMarket.getTrades(currencyPair.base.getCurrencyCode().toUpperCase() + currencyPair.counter.getCurrencyCode().toUpperCase());
   }
 
 }
