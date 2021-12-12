diff --git a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
index 6ac8a37..4ead257 100644
--- a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
+++ b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
@@ -270,7 +270,7 @@
 
         String aLabel = "hazeIntermediateNode";
         FBOConfig hazeIntermediateConfig = new FBOConfig(HazeNode.INTERMEDIATE_HAZE_FBO, ONE_16TH_SCALE, FBO.Type.DEFAULT);
-        HazeNode hazeIntermediateNode = new HazeNode(context, readOnlyGBufferConfig, hazeIntermediateConfig, aLabel);
+        HazeNode hazeIntermediateNode = new HazeNode(context, writeOnlyGBufferConfig, hazeIntermediateConfig, aLabel);
         renderGraph.addNode(hazeIntermediateNode, aLabel);
 
         aLabel = "hazeFinalNode";
@@ -335,7 +335,7 @@
         renderGraph.addNode(initialPostProcessingNode, "initialPostProcessingNode");
 
         aLabel = "downSampling_gBuffer_to_16x16px_forExposure";
-        DownSamplerForExposureNode exposureDownSamplerTo16pixels = new DownSamplerForExposureNode(context, readOnlyGBufferConfig, displayResolutionDependentFBOs, FBO_16X16_CONFIG, immutableFBOs, aLabel);
+        DownSamplerForExposureNode exposureDownSamplerTo16pixels = new DownSamplerForExposureNode(context, writeOnlyGBufferConfig, displayResolutionDependentFBOs, FBO_16X16_CONFIG, immutableFBOs, aLabel);
         renderGraph.addNode(exposureDownSamplerTo16pixels, aLabel);
 
         aLabel = "downSampling_16x16px_to_8x8px_forExposure";
