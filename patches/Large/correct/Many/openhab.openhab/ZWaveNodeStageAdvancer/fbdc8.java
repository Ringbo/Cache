diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
index a6917cc..b661e6a 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
@@ -537,7 +537,7 @@
 			// If we have all the data, set stageAdvanced to true to tell the
 			// system
 			// that we're starting again, then loop around again.
-			if (sendMessage() == false) {
+			if (currentStage != NodeStage.DONE && sendMessage() == false) {
 				// Move on to the next stage
 				currentStage = currentStage.getNextStage();
 				stageAdvanced = true;
