diff --git a/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java b/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
index 061d780..36db056 100644
--- a/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
+++ b/worldedit-core/src/main/java/com/sk89q/worldedit/math/transform/AffineTransform.java
@@ -165,7 +165,7 @@
         double det = this.determinant();
         return new AffineTransform(
                 (m11 * m22 - m21 * m12) / det,
-                (m21 * m01 - m01 * m22) / det,
+                (m21 * m02 - m01 * m22) / det,
                 (m01 * m12 - m11 * m02) / det,
                 (m01 * (m22 * m13 - m12 * m23) + m02 * (m11 * m23 - m21 * m13)
                         - m03 * (m11 * m22 - m21 * m12)) / det,
