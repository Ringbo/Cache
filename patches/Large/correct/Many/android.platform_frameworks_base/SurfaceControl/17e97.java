diff --git a/core/java/android/view/SurfaceControl.java b/core/java/android/view/SurfaceControl.java
index 5482589..ff027a9 100644
--- a/core/java/android/view/SurfaceControl.java
+++ b/core/java/android/view/SurfaceControl.java
@@ -1161,9 +1161,9 @@
          */
         public Transaction setOpaque(SurfaceControl sc, boolean isOpaque) {
             if (isOpaque) {
-                nativeSetFlags(mNativeObject, sc.mNativeObject, OPAQUE, OPAQUE);
+                nativeSetFlags(mNativeObject, sc.mNativeObject, SURFACE_OPAQUE, SURFACE_OPAQUE);
             } else {
-                nativeSetFlags(mNativeObject, sc.mNativeObject, 0, OPAQUE);
+                nativeSetFlags(mNativeObject, sc.mNativeObject, 0, SURFACE_OPAQUE);
             }
             return this;
         }
