diff --git a/ReactAndroid/src/main/java/com/facebook/react/modules/camera/ImageEditingManager.java b/ReactAndroid/src/main/java/com/facebook/react/modules/camera/ImageEditingManager.java
index be9ef2f..952d923 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/modules/camera/ImageEditingManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/modules/camera/ImageEditingManager.java
@@ -485,7 +485,7 @@
     File externalCacheDir = context.getExternalCacheDir();
     File internalCacheDir = context.getCacheDir();
     File cacheDir;
-    if (externalCacheDir == null && externalCacheDir == null) {
+    if (externalCacheDir == null && internalCacheDir == null) {
       throw new IOException("No cache directory available");
     }
     if (externalCacheDir == null) {
