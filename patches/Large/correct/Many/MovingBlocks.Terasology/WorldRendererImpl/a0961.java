diff --git a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
index d5bd9a9..e2bc7bc 100644
--- a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
+++ b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
@@ -258,7 +258,7 @@
 
         addWorldRenderingNodes(renderGraph);
 
-        addSkyNodes();
+        addSkyNodes(renderGraph);
 
         addLightingNodes(renderGraph);
 
