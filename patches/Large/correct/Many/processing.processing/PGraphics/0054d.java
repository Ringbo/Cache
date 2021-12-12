diff --git a/core/PGraphics.java b/core/PGraphics.java
index b92dd26..853895a 100644
--- a/core/PGraphics.java
+++ b/core/PGraphics.java
@@ -2199,7 +2199,7 @@
    * coordinates of a shape.
    */
   public float modelX(float x, float y, float z) {
-    depthErrorXYZ("modelX");
+    depthError("modelX");
     return 0;
   }
 
@@ -2208,7 +2208,7 @@
    * Returns the model space y value for an x, y, z coordinate.
    */
   public float modelY(float x, float y, float z) {
-    depthErrorXYZ("modelY");
+    depthError("modelY");
     return 0;
   }
 
@@ -2217,7 +2217,7 @@
    * Returns the model space z value for an x, y, z coordinate.
    */
   public float modelZ(float x, float y, float z) {
-    depthErrorXYZ("modelZ");
+    depthError("modelZ");
     return 0;
   }
 
