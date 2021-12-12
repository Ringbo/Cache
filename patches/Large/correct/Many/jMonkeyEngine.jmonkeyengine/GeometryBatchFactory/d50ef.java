diff --git a/engine/src/tools/jme3tools/optimize/GeometryBatchFactory.java b/engine/src/tools/jme3tools/optimize/GeometryBatchFactory.java
index 067427b..dff58df 100644
--- a/engine/src/tools/jme3tools/optimize/GeometryBatchFactory.java
+++ b/engine/src/tools/jme3tools/optimize/GeometryBatchFactory.java
@@ -291,7 +291,7 @@
             if (outList == null) {
                 //trying to compare materials with the isEqual method 
                 for (Material mat : matToGeom.keySet()) {
-                    if (geom.getMaterial().isEqual(mat)) {
+                    if (geom.getMaterial().equals(mat)) {
                         outList = matToGeom.get(mat);
                     }
                 }
