diff --git a/engine/src/terrain/com/jme3/terrain/geomipmap/MultiTerrainLodControl.java b/engine/src/terrain/com/jme3/terrain/geomipmap/MultiTerrainLodControl.java
index 3ee9b29..995bc8f 100644
--- a/engine/src/terrain/com/jme3/terrain/geomipmap/MultiTerrainLodControl.java
+++ b/engine/src/terrain/com/jme3/terrain/geomipmap/MultiTerrainLodControl.java
@@ -80,7 +80,7 @@
      * the render thread.
      */
     public void removeTerrain(TerrainQuad tq) {
-        removedTerrains.remove(tq);
+        removedTerrains.add(tq);
     }
     
     @Override
