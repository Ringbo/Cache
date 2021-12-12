diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiInstanceCommandClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiInstanceCommandClass.java
index 9d38482..3ef5569 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiInstanceCommandClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiInstanceCommandClass.java
@@ -281,7 +281,7 @@
 			ZWaveEndpoint endpoint = this.endpoints.get(endpointId);
 			
 			if (endpoint == null){
-				logger.error("Endpoint {} not found on node {}. Cannot set command classes.", endpoint, this.getNode().getNodeId());
+				logger.error("Endpoint {} not found on node {}. Cannot set command classes.", endpointId, this.getNode().getNodeId());
 				continue;
 			}
 	
@@ -377,7 +377,7 @@
 		ZWaveEndpoint endpoint = this.endpoints.get(endpointId);
 		
 		if (endpoint == null){
-			logger.error("Endpoint {} not found on node {}. Cannot set command classes.", endpoint, this.getNode().getNodeId());
+			logger.error("Endpoint {} not found on node {}. Cannot set command classes.", endpointId, this.getNode().getNodeId());
 			return;
 		}
 		
