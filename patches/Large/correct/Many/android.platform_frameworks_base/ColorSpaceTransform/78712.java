diff --git a/core/java/android/hardware/camera2/params/ColorSpaceTransform.java b/core/java/android/hardware/camera2/params/ColorSpaceTransform.java
index fa8c8ea..503af26 100644
--- a/core/java/android/hardware/camera2/params/ColorSpaceTransform.java
+++ b/core/java/android/hardware/camera2/params/ColorSpaceTransform.java
@@ -162,7 +162,7 @@
     public void copyElements(Rational[] destination, int offset) {
         checkArgumentNonnegative(offset, "offset must not be negative");
         checkNotNull(destination, "destination must not be null");
-        if (destination.length + offset < COUNT) {
+        if (destination.length - offset < COUNT) {
             throw new ArrayIndexOutOfBoundsException("destination too small to fit elements");
         }
 
@@ -197,7 +197,7 @@
     public void copyElements(int[] destination, int offset) {
         checkArgumentNonnegative(offset, "offset must not be negative");
         checkNotNull(destination, "destination must not be null");
-        if (destination.length + offset < COUNT_INT) {
+        if (destination.length - offset < COUNT_INT) {
             throw new ArrayIndexOutOfBoundsException("destination too small to fit elements");
         }
 
