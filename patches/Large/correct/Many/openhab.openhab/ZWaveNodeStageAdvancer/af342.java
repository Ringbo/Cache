diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
index d6c1ad0..88db7f2 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/initialization/ZWaveNodeStageAdvancer.java
@@ -69,8 +69,8 @@
 	 */
 	public void advanceNodeStage(NodeStage targetStage) {
 		if (targetStage.getStage() <= this.node.getNodeStage().getStage() && targetStage != NodeStage.DONE) {
-			logger.warn(String.format("NODE %d: Already in or beyond node stage, ignoring. current = %s, requested = %s", this.node
-					.getNodeStage().getLabel(), targetStage.getLabel()));
+			logger.warn(String.format("NODE %d: Already in or beyond node stage, ignoring. current = %s, requested = %s", this.node.getNodeId(),
+					this.node.getNodeStage().getLabel(), targetStage.getLabel()));
 			return;
 		}
 
