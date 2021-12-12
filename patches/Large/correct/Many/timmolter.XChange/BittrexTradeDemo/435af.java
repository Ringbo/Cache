diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/v1/trade/BittrexTradeDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/v1/trade/BittrexTradeDemo.java
index a99ea6d..e953315 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/v1/trade/BittrexTradeDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/bittrex/v1/trade/BittrexTradeDemo.java
@@ -71,7 +71,7 @@
       Thread.sleep(7000); // wait for order to propagate
 
       System.out.println();
-      System.out.println(tradeService.getBittrexOpenOrders());
+      System.out.println(tradeService.getBittrexOpenOrders(null));
 
       System.out.println("Attempting to cancel order " + uuid);
       boolean cancelled = tradeService.cancelBittrexLimitOrder(uuid);
@@ -85,7 +85,7 @@
       Thread.sleep(7000); // wait for cancellation to propagate
 
       System.out.println();
-      System.out.println(tradeService.getBittrexOpenOrders());
+      System.out.println(tradeService.getBittrexOpenOrders(null));
 
     } catch (Exception e) {
       e.printStackTrace();
