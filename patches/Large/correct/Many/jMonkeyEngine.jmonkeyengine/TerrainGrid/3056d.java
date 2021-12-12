diff --git a/engine/src/terrain/com/jme3/terrain/geomipmap/TerrainGrid.java b/engine/src/terrain/com/jme3/terrain/geomipmap/TerrainGrid.java
index ccbdeed..c18d3de 100644
--- a/engine/src/terrain/com/jme3/terrain/geomipmap/TerrainGrid.java
+++ b/engine/src/terrain/com/jme3/terrain/geomipmap/TerrainGrid.java
@@ -147,7 +147,7 @@
                             q.setMaterial(material.clone());
                             log.log(Level.FINE, "Loaded TerrainQuad {0} from HeightMapGrid", q.getName());
                         } else if (terrainQuadGrid != null) {
-                            q = terrainQuadGrid.getTerrainQuadAt(location);
+                            q = terrainQuadGrid.getTerrainQuadAt(temp);
                             q.setMaterial(material);
                             log.log(Level.FINE, "Loaded TerrainQuad {0} from TerrainQuadGrid", q.getName());
                         }
