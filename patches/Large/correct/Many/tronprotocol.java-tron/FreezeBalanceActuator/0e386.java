diff --git a/src/main/java/org/tron/core/actuator/FreezeBalanceActuator.java b/src/main/java/org/tron/core/actuator/FreezeBalanceActuator.java
index 717cb8a..8283252 100755
--- a/src/main/java/org/tron/core/actuator/FreezeBalanceActuator.java
+++ b/src/main/java/org/tron/core/actuator/FreezeBalanceActuator.java
@@ -60,7 +60,7 @@
 
   private long calculateBandwidth(FreezeBalanceContract freezeBalanceContract) {
 
-    return freezeBalanceContract.getFrozenBalance() / 10000
+    return freezeBalanceContract.getFrozenBalance() / 1_000_000
         * freezeBalanceContract.getFrozenDuration()
         * dbManager.getDynamicPropertiesStore().getBandwidthPerCoinday();
   }
