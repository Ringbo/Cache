diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveController.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveController.java
index 5ff300c..28a8b51 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveController.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/ZWaveController.java
@@ -1178,7 +1178,7 @@
 	    				sendAllowed.release();
 	    			}
 					recvMessage = recvQueue.take();
-					logger.trace("Receive queue TAKE: Length={}", recvQueue.size());
+					logger.debug("Receive queue TAKE: Length={}", recvQueue.size());
 					logger.debug("Process Message = {}", SerialMessage.bb2hex(recvMessage.getMessageBuffer()));
 
 		    		handleIncomingMessage(recvMessage);
@@ -1420,7 +1420,7 @@
     		}
 
     		recvQueue.add(recvMessage);
-			logger.trace("Receive queue ADD: Length={}", recvQueue.size());
+			logger.debug("Receive queue ADD: Length={}", recvQueue.size());
         }
 
 		/**
