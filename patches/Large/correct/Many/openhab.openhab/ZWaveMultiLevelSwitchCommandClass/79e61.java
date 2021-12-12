diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiLevelSwitchCommandClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiLevelSwitchCommandClass.java
index 48872cc..7f3eca5 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiLevelSwitchCommandClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiLevelSwitchCommandClass.java
@@ -161,7 +161,7 @@
 		logger.debug("Creating new message for application command SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE for node {}", this.getNode().getNodeId());
 		SerialMessage result = new SerialMessage(this.getNode().getNodeId(), SerialMessageClass.SendData, SerialMessageType.Request, SerialMessageClass.SendData, SerialMessagePriority.Set);
     	byte[] newPayload = { 	(byte) this.getNode().getNodeId(), 
-    							3, 
+    							2, 
 								(byte) getCommandClass().getKey(), 
 								(byte) SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE };
     	result.setMessagePayload(newPayload);
