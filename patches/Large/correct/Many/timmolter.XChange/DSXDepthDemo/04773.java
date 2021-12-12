diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/marketdata/DSXDepthDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/marketdata/DSXDepthDemo.java
index 03ecb8a..00507e4 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/marketdata/DSXDepthDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/dsx/marketdata/DSXDepthDemo.java
@@ -28,15 +28,15 @@
 
     MarketDataService marketDataService = exchange.getMarketDataService();
 
-    OrderBook orderBook = marketDataService.getOrderBook(CurrencyPair.LTC_USD);
+    OrderBook orderBook = marketDataService.getOrderBook(CurrencyPair.LTC_USD, "LIVE");
     System.out.println(orderBook.toString());
     System.out.println("size: " + (orderBook.getAsks().size() + orderBook.getBids().size()));
 
-    orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD, 2000);
+    orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD, "DEMO");
     System.out.println(orderBook.toString());
     System.out.println("size: " + (orderBook.getAsks().size() + orderBook.getBids().size()));
 
-    orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD, 3);
+    orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD);
     System.out.println(orderBook.toString());
     System.out.println("size: " + (orderBook.getAsks().size() + orderBook.getBids().size()));
   }
