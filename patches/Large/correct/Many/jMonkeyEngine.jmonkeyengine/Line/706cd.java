diff --git a/engine/src/core/com/jme3/scene/shape/Line.java b/engine/src/core/com/jme3/scene/shape/Line.java
index 577f3b1..e2ac6d8 100644
--- a/engine/src/core/com/jme3/scene/shape/Line.java
+++ b/engine/src/core/com/jme3/scene/shape/Line.java
@@ -73,7 +73,7 @@
         setBuffer(Type.Normal, 3, new float[]{0, 0, 1,
                                               0, 0, 1});
 
-        setBuffer(Type.Index, 3, new short[]{0, 1});
+        setBuffer(Type.Index, 2, new short[]{0, 1});
 
         updateBound();
     }
