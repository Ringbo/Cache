diff --git a/core/java/android/hardware/camera2/params/OutputConfiguration.java b/core/java/android/hardware/camera2/params/OutputConfiguration.java
index f47cd66..eb4bced 100644
--- a/core/java/android/hardware/camera2/params/OutputConfiguration.java
+++ b/core/java/android/hardware/camera2/params/OutputConfiguration.java
@@ -576,7 +576,7 @@
      *
      * @see #enableSurfaceSharing
      */
-    public static int getMaxSharedSurfaceCount() {
+    public int getMaxSharedSurfaceCount() {
         return MAX_SURFACES_COUNT;
     }
 
