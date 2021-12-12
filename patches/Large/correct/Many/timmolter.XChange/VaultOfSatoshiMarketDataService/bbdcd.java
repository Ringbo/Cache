diff --git a/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java b/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
index 04cc7ea..d0608a0 100644
--- a/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
+++ b/xchange-vaultofsatoshi/src/main/java/com/xeiam/xchange/vaultofsatoshi/service/polling/VaultOfSatoshiMarketDataService.java
@@ -89,7 +89,7 @@
       } else {
         throw new ExchangeException("args[0] must be of type Number!");
       }
-      if (args.length == 1) {
+      if (args.length > 1) {
         Object arg1 = args[1];
         if (arg1 instanceof Number) {
           count = ((Number) arg1).intValue();
