diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiCommandCommandClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiCommandCommandClass.java
index bfd7d6b..3f051a0 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiCommandCommandClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/commandclass/ZWaveMultiCommandCommandClass.java
@@ -111,7 +111,7 @@
 				}
 				else {
 					logger.debug("NODE {}: Calling handleApplicationCommandRequest.", this.getNode().getNodeId());
-					zwaveCommandClass.handleApplicationCommandRequest(serialMessage, offset + 2, 1);
+					zwaveCommandClass.handleApplicationCommandRequest(serialMessage, offset + 2, 0);
 				}
 			}
 
