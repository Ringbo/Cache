diff --git a/app/src/main/java/com/hippo/ehviewer/gallery/glrenderer/XmlResourceTexture.java b/app/src/main/java/com/hippo/ehviewer/gallery/glrenderer/XmlResourceTexture.java
index 97755a4..4b11154 100644
--- a/app/src/main/java/com/hippo/ehviewer/gallery/glrenderer/XmlResourceTexture.java
+++ b/app/src/main/java/com/hippo/ehviewer/gallery/glrenderer/XmlResourceTexture.java
@@ -48,16 +48,16 @@
 
         int width = mWidth;
         int height = mHeight;
-        if (mWidth <= 0) {
+        if (width <= 0) {
             width = drawable.getIntrinsicWidth();
         }
-        if (mHeight <= 0) {
+        if (height <= 0) {
             height = drawable.getIntrinsicHeight();
         }
-        if (mWidth <= 0) {
+        if (width <= 0) {
             width = 1;
         }
-        if (mHeight <= 0) {
+        if (height <= 0) {
             height = 1;
         }
 
