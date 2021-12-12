diff --git a/contrib/alphamaskdemo/com/sun/jna/contrib/demo/AlphaMaskDemo.java b/contrib/alphamaskdemo/com/sun/jna/contrib/demo/AlphaMaskDemo.java
index dd3dbb9..d1581d1 100644
--- a/contrib/alphamaskdemo/com/sun/jna/contrib/demo/AlphaMaskDemo.java
+++ b/contrib/alphamaskdemo/com/sun/jna/contrib/demo/AlphaMaskDemo.java
@@ -154,7 +154,7 @@
                 int w = image.getWidth(null);
                 int h = image.getHeight(null);
                 alphaWindow.setSize(w, h);
-                if (buffer == null || buffer.getSize() != w*h*4) {
+                if (buffer == null || buffer.size() != w*h*4) {
                     buffer = new com.sun.jna.Memory(w*h*4);
                     pixels = new int[w*h];
                 }
