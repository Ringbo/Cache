diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
index 0123361..fa2ec1a 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
@@ -747,7 +747,7 @@
 
 				// If there are no configuration entries for this node, then continue.
 				List<ZWaveDbConfigurationParameter> configList = database.getProductConfigParameters();
-				if(configList.size() == 0) {
+				if(configList == null || configList.size() == 0) {
 					break;
 				}
 
