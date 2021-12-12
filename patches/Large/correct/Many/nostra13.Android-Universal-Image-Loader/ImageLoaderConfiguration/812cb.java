diff --git a/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java b/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
index 9caecbe..ed5adcb 100644
--- a/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
+++ b/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
@@ -359,7 +359,7 @@
          * {@link MemoryCacheAware}.
          */
         public Builder memoryCachePercent(int memoryCachePercent) {
-            if (memoryCacheSize <= 0) throw new IllegalArgumentException("memoryCacheSize must be a positive number");
+            if (memoryCachePercent <= 0) throw new IllegalArgumentException("memoryCacheSize must be a positive number");
 
             if (memoryCache != null) {
                 L.w(WARNING_OVERLAP_MEMORY_CACHE);
