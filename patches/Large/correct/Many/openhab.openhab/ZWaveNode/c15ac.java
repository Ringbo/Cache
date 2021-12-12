diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
index 80c8e6b..5a27139 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveNode.java
@@ -407,13 +407,13 @@
 	public double getApplicationVersion() {
 		ZWaveVersionCommandClass versionCmdClass = (ZWaveVersionCommandClass) this.getCommandClass(CommandClass.VERSION);
 		if(versionCmdClass == null) {
-			logger.debug("NODE {}: App version requested but Version class not supported", this.getNodeId());
+			logger.trace("NODE {}: App version requested but Version class not supported", this.getNodeId());
 			return 0.0;
 		}
 
 		Double appVersion = versionCmdClass.getApplicationVersion();
 		if(appVersion == null) {
-			logger.debug("NODE {}: App version requested but version is unknown", this.getNodeId());
+			logger.trace("NODE {}: App version requested but version is unknown", this.getNodeId());
 			return 0.0;			
 		}
 		
