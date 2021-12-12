diff --git a/core/src/processing/core/PImage.java b/core/src/processing/core/PImage.java
index ecc0281..3fc5edf 100644
--- a/core/src/processing/core/PImage.java
+++ b/core/src/processing/core/PImage.java
@@ -331,7 +331,7 @@
       //x2 += x1; y2 += y1;
       // w/h are x2/y2 in this case, bring em down to size
       w = (w - x);
-      h = (h - x);
+      h = (h - y);
     }
 
     if (x < 0) {
