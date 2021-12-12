diff --git a/src/main/java/org/tron/core/db/DynamicPropertiesStore.java b/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
index b5acccc..7f16706 100755
--- a/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
+++ b/src/main/java/org/tron/core/db/DynamicPropertiesStore.java
@@ -819,7 +819,7 @@
         new BytesCapsule(ByteArray.fromLong(totalEnergyLimit)));
 
     saveTotalEnergyTargetLimit(totalEnergyLimit / 14400);
-    if (this.getAllowAdaptiveEnergy() == 0) {
+    if (this.getAllowAdaptiveEnergy() == 0 && getLatestProposalNum() > 7) {
       saveTotalEnergyCurrentLimit(totalEnergyLimit);
     }
 
