diff --git a/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java b/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
index 8b16d14..b38f422 100644
--- a/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
+++ b/library/src/main/java/jp/co/cyberagent/android/gpuimage/filter/GPUImageFilter.java
@@ -297,7 +297,7 @@
     }
     
     private void checkIsInitialized() {
-        if (!mIsInitialized) {
+        if (!isInitialized) {
             throw new AssertionError("Filter should be initialized");
         }
     }
