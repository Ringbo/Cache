diff --git a/engine/src/core/com/jme3/animation/Bone.java b/engine/src/core/com/jme3/animation/Bone.java
index 644e32d..eac5433 100644
--- a/engine/src/core/com/jme3/animation/Bone.java
+++ b/engine/src/core/com/jme3/animation/Bone.java
@@ -360,7 +360,7 @@
 
         localPos.addLocal(translation);
         localRot = localRot.mult(rotation);
-        localScale.addLocal(scale);
+        localScale.multLocal(scale);
     }
 
     /**
