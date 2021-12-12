diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveBatteryCommandClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveBatteryCommandClass.java
index 040270e..312092d 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveBatteryCommandClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveBatteryCommandClass.java
@@ -100,7 +100,7 @@
                 if (batteryLevel == 255) {
                     batteryLevel = 0;
                     batteryLow = true;
-                    logger.warn("NODE {}: BATTERY LOW!", this.getNode().getNodeId());
+                    logger.debug("NODE {}: BATTERY LOW!", this.getNode().getNodeId());
                 } else {
                     batteryLow = false;
                 }
