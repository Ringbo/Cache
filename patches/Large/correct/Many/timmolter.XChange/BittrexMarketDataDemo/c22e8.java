diff --git a/xchange-examples/src/main/java/com/xeiam/xchange/examples/bittrex/v1/marketdata/BittrexMarketDataDemo.java b/xchange-examples/src/main/java/com/xeiam/xchange/examples/bittrex/v1/marketdata/BittrexMarketDataDemo.java
index 30038d5..41321bf 100644
--- a/xchange-examples/src/main/java/com/xeiam/xchange/examples/bittrex/v1/marketdata/BittrexMarketDataDemo.java
+++ b/xchange-examples/src/main/java/com/xeiam/xchange/examples/bittrex/v1/marketdata/BittrexMarketDataDemo.java
@@ -79,7 +79,7 @@
     ArrayList<BittrexTicker> tickers = marketDataService.getBittrexTickers();
     System.out.println(tickers);
 
-    BittrexDepth orderBook = marketDataService.getBittrexOrderBook(pairString);
+    BittrexDepth orderBook = marketDataService.getBittrexOrderBook(pairString, 50);
     System.out.println(orderBook);
 
     BittrexTrade[] trades = marketDataService.getBittrexTrades(pairString, 100);
