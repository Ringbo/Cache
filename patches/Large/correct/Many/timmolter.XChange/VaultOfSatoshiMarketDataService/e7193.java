diff --git a/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java b/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
index 88bee54..04cc7ea 100644
--- a/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
+++ b/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
@@ -82,14 +82,14 @@
     Long sinceId = null;
     int count = 100;
 
-    if (args.length > 1) {
+    if (args.length > 0) {
       Object arg0 = args[0];
       if (arg0 instanceof Number) {
         sinceId = ((Number) arg0).longValue();
       } else {
         throw new ExchangeException("args[0] must be of type Number!");
       }
-      if (args.length == 2) {
+      if (args.length == 1) {
         Object arg1 = args[1];
         if (arg1 instanceof Number) {
           count = ((Number) arg1).intValue();
