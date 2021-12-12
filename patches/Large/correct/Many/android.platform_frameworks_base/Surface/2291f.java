diff --git a/core/java/android/view/Surface.java b/core/java/android/view/Surface.java
index 10fddfa..cde20e4 100644
--- a/core/java/android/view/Surface.java
+++ b/core/java/android/view/Surface.java
@@ -386,7 +386,7 @@
 
     @Override
     public String toString() {
-        return "Surface(native-token=" + mSurface + ")";
+        return "Surface(native-token=" + mSurfaceControl + ")";
     }
 
     private Surface(Parcel source) throws OutOfResourcesException {
