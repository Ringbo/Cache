diff --git a/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java b/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
index 41d8590..061d780 100644
--- a/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
+++ b/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
@@ -116,7 +116,7 @@
             return false;
         if (m11 != 1)
             return false;
-        if (m22 != 0)
+        if (m22 != 1)
             return false;
         if (m01 != 0)
             return false;
