diff --git a/engine/src/core/com/jme3/font/BitmapTextPage.java b/engine/src/core/com/jme3/font/BitmapTextPage.java
index aac50ba..1e89866 100644
--- a/engine/src/core/com/jme3/font/BitmapTextPage.java
+++ b/engine/src/core/com/jme3/font/BitmapTextPage.java
@@ -61,7 +61,7 @@
         super("BitmapFont", new Mesh());
 
         if (font == null) {
-            throw new NullPointerException("'font' cannot be null.");
+            throw new IllegalArgumentException("font cannot be null.");
         }
 
         this.page = page;
