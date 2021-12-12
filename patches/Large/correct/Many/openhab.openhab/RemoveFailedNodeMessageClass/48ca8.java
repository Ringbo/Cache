diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/RemoveFailedNodeMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/RemoveFailedNodeMessageClass.java
index d204c20..98b8258 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/RemoveFailedNodeMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/RemoveFailedNodeMessageClass.java
@@ -53,7 +53,7 @@
 		logger.debug("Got RemoveFailedNode response.");
 		int nodeId = lastSentMessage.getMessagePayloadByte(0);
 
-		switch(incomingMessage.getMessagePayloadByte(1)) {
+		switch(incomingMessage.getMessagePayloadByte(0)) {
 			case FAILED_NODE_REMOVE_STARTED:
 				logger.debug("NODE {}: Remove failed node successfully placed on stack.", nodeId);
 				break;
