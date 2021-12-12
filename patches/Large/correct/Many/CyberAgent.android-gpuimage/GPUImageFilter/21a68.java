diff --git a/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java b/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
index d1360e4..8b16d14 100644
--- a/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
+++ b/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
@@ -297,7 +297,7 @@
     }
     
     private void checkIsInitialized() {
-        if (!mInInitialized) {
+        if (!mIsInitialized) {
             throw new AssertionError("Filter should be initialized");
         }
     }
