diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/marketdata/BittrexMarketDataDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/marketdata/BittrexMarketDataDemo.java
index 60f2125..c8e6072 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/marketdata/BittrexMarketDataDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/marketdata/BittrexMarketDataDemo.java
@@ -81,7 +81,7 @@
     BittrexDepth orderBook = marketDataService.getBittrexOrderBook(pairString, 50);
     System.out.println(orderBook);
 
-    BittrexTrade[] trades = marketDataService.getBittrexTrades(pairString, 100);
+    BittrexTrade[] trades = marketDataService.getBittrexTrades(pairString);
     System.out.println(Arrays.asList(trades));
 
     BittrexTicker ticker = marketDataService.getBittrexTicker(pair);
