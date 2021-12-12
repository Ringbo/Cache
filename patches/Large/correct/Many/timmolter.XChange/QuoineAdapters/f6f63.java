diff --git a/xchange-quoine/src/main/java/org/knowm/xchange/quoine/QuoineAdapters.java b/xchange-quoine/src/main/java/org/knowm/xchange/quoine/QuoineAdapters.java
index fd553a2..83f299c 100644
--- a/xchange-quoine/src/main/java/org/knowm/xchange/quoine/QuoineAdapters.java
+++ b/xchange-quoine/src/main/java/org/knowm/xchange/quoine/QuoineAdapters.java
@@ -36,7 +36,7 @@
     Ticker.Builder builder = new Ticker.Builder();
     builder.ask(quoineTicker.getMarketAsk());
     builder.bid(quoineTicker.getMarketBid());
-    builder.last(quoineTicker.getLastPrice24h());
+    builder.last(quoineTicker.getLastTradedPrice());
     builder.volume(quoineTicker.getVolume24h());
     builder.currencyPair(currencyPair);
     return builder.build();
