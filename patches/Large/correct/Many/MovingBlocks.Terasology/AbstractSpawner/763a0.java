diff --git a/engine/src/main/java/org/terasology/logic/spawner/AbstractSpawner.java b/engine/src/main/java/org/terasology/logic/spawner/AbstractSpawner.java
index c3dee0d..6a0107c 100644
--- a/engine/src/main/java/org/terasology/logic/spawner/AbstractSpawner.java
+++ b/engine/src/main/java/org/terasology/logic/spawner/AbstractSpawner.java
@@ -62,13 +62,13 @@
         for (BaseVector2i test : spiral) {
             float val = surfaceHeightFacet.getWorld(test.getX(), test.getY());
             int height = TeraMath.floorToInt(val);
-            if (height > seaLevel) {
+            if (height >= seaLevel) {
                 return new Vector3f(test.getX(), height, test.getY());
             }
         }
 
         // nothing above sea level found
-        float y = surfaceHeightFacet.get(pos.getX(), pos.getY());
+        float y = surfaceHeightFacet.getWorld(pos.getX(), pos.getY());
         return new Vector3f(pos.getX(), y, pos.getY());
     }
 }
