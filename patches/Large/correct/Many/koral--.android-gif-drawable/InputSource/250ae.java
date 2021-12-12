diff --git a/src/main/java/pl/droidsonroids/gif/InputSource.java b/src/main/java/pl/droidsonroids/gif/InputSource.java
index 7808666..00d2749 100644
--- a/src/main/java/pl/droidsonroids/gif/InputSource.java
+++ b/src/main/java/pl/droidsonroids/gif/InputSource.java
@@ -148,7 +148,7 @@
 
         @Override
         GifInfoHandle open() throws IOException {
-            return GifInfoHandle.openAssetFileDescriptor(mAssetManager.openNonAssetFd(mAssetName), false);
+            return GifInfoHandle.openAssetFileDescriptor(mAssetManager.openFd(mAssetName), false);
         }
     }
 
