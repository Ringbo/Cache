diff --git a/engine/src/main/java/org/terasology/world/propagation/SunlightRegenBatchPropagator.java b/engine/src/main/java/org/terasology/world/propagation/SunlightRegenBatchPropagator.java
index 39b99df..a454b33 100644
--- a/engine/src/main/java/org/terasology/world/propagation/SunlightRegenBatchPropagator.java
+++ b/engine/src/main/java/org/terasology/world/propagation/SunlightRegenBatchPropagator.java
@@ -238,7 +238,7 @@
                 } else {
                     int initialDepth = Math.max(adjDepths[depthIndex], ChunkConstants.SUNLIGHT_REGEN_THRESHOLD - start);
                     byte strength = (byte) Math.min(ChunkConstants.MAX_SUNLIGHT, start + initialDepth - ChunkConstants.SUNLIGHT_REGEN_THRESHOLD + 1);
-                    for (int i = initialDepth; i < depth[depthIndex]; ++i) {
+                    for (int i = initialDepth; i <= depth[depthIndex]; ++i) {
                         sunlightPropagator.propagateFrom(toChunk.chunkToWorldPosition(x, ChunkConstants.SIZE_Y - i - 1, z), strength);
                         if (strength < ChunkConstants.MAX_SUNLIGHT) {
                             strength++;
