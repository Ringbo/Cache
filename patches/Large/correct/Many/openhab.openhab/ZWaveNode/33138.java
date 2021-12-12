diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
index 287f8ed..eccb45a 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
@@ -535,7 +535,7 @@
 		}
 		else if (multiInstanceCommandClass.getVersion() == 1) {
 			ZWaveCommandClass result = getCommandClass(commandClass);
-			if (endpointId <= result.getInstances()) {
+			if (result != null && endpointId <= result.getInstances()) {
 				return result;
 			}
 		} else {
