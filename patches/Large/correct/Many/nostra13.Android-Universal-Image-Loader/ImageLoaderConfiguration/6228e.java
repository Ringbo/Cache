diff --git a/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java b/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
index 961c86a..23f87ba 100644
--- a/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
+++ b/library/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
@@ -367,7 +367,7 @@
             if (memoryCachePercent > 80) {
                 memoryCachePercent = 80;
             }
-            int capacity = (int) ((Runtime.getRuntime().maxMemory() * (memoryCachePercent / 100)));
+            int capacity = (int) ((Runtime.getRuntime().maxMemory() * (memoryCachePercent / 100f)));
             if (capacity > 0) {
                 this.memoryCacheSize = capacity;
             }
