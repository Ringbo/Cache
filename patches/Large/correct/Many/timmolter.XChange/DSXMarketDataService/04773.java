diff --git a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXMarketDataService.java b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXMarketDataService.java
index 72ef235..c2eac52 100644
--- a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXMarketDataService.java
+++ b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXMarketDataService.java
@@ -59,7 +59,7 @@
   /**
    * Get market depth from exchange
    *
-   * @param currencyPair Currency pair for getting info abount
+   * @param currencyPair Currency pair for getting info about
    * @param args Optional arguments. Exchange-specific
    * @return The OrderBook
    * @throws IOException
@@ -71,7 +71,7 @@
 
     String accountType = null;
     try {
-      accountType = (String) args[1];
+      accountType = (String) args[0];
     } catch (ArrayIndexOutOfBoundsException e) {
       // ignore, can happen if no argument given.
     }
