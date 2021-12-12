diff --git a/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java b/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
index 1cdc435..197832f 100644
--- a/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
+++ b/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
@@ -113,7 +113,7 @@
 
     private static native int getHeight(long gifFileInPtr);
 
-    private native int getNumberOfFrames(long gifInfoPtr);
+    private static native int getNumberOfFrames(long gifInfoPtr);
 
     GifInfoHandle(InputStream stream, boolean justDecodeMetaData) throws GifIOException {
         if (!stream.markSupported()) {
