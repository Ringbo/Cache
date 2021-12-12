diff --git a/core/src/processing/awt/PGraphicsJava2D.java b/core/src/processing/awt/PGraphicsJava2D.java
index edcb3fa..e34303a 100644
--- a/core/src/processing/awt/PGraphicsJava2D.java
+++ b/core/src/processing/awt/PGraphicsJava2D.java
@@ -2797,7 +2797,7 @@
     if (pixels != null) {
       getRaster().setDataElements(0, 0, pixelWidth, pixelHeight, pixels);
     }
-    modified = false;
+    modified = true;
   }
 
 
