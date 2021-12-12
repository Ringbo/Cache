diff --git a/xchange-examples/src/main/java/com/xeiam/xchange/examples/bitfinex/marketdata/TradesDemo.java b/xchange-examples/src/main/java/com/xeiam/xchange/examples/bitfinex/marketdata/TradesDemo.java
index 5c30103..b2d31c6 100644
--- a/xchange-examples/src/main/java/com/xeiam/xchange/examples/bitfinex/marketdata/TradesDemo.java
+++ b/xchange-examples/src/main/java/com/xeiam/xchange/examples/bitfinex/marketdata/TradesDemo.java
@@ -62,7 +62,7 @@
   private static void raw(BitfinexMarketDataServiceRaw marketDataService) throws IOException {
 
     // Get the latest trade data for BTC/USD
-    BitfinexTrade[] trades = marketDataService.getBitfinexTrades("btcusd");
+    BitfinexTrade[] trades = marketDataService.getBitfinexTrades("btcusd", System.currentTimeMillis() / 1000 - 120);
     System.out.println("Trades, default. Size= " + trades.length);
     System.out.println(Arrays.toString(trades));
   }
