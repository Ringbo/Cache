diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
index 5bde0b0..10cc81c 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
@@ -316,7 +316,7 @@
 					if(currentStage.isStaticComplete()) {
 						// If static stages are complete, then we skip forward to the next
 						// stage.
-						logger.debug("NODE {}: Retry timout: Advancing");
+						logger.debug("NODE {}: Retry timout: Advancing", node.getNodeId());
 						setCurrentStage(currentStage.getNextStage());
 					}
 					else {
@@ -324,7 +324,7 @@
 						// up with incomplete information about the device.
 						// During the static stages, we use the back off timer to pace things
 						// and retry until the stage is complete
-						logger.debug("NODE {}: Retry timout: Can't advance");
+						logger.debug("NODE {}: Retry timout: Can't advance", node.getNodeId());
 						break;
 					}
 				}
