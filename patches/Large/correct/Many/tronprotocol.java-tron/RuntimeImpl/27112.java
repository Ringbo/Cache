diff --git a/src/main/java/org/tron/common/runtime/RuntimeImpl.java b/src/main/java/org/tron/common/runtime/RuntimeImpl.java
index f730820..0cbd9b4 100644
--- a/src/main/java/org/tron/common/runtime/RuntimeImpl.java
+++ b/src/main/java/org/tron/common/runtime/RuntimeImpl.java
@@ -228,7 +228,7 @@
           feeLimit / sunPerEnergy;
     } else {
       long totalEnergyFromFreeze = energyProcessor
-          .calculateGlobalEnergyLimit(totalBalanceForEnergyFreeze);
+          .calculateGlobalEnergyLimit(account);
       long leftBalanceForEnergyFreeze = getEnergyFee(totalBalanceForEnergyFreeze,
           leftEnergyFromFreeze,
           totalEnergyFromFreeze);
