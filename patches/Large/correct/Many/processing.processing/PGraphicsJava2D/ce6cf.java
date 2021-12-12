diff --git a/core/src/processing/core/PGraphicsJava2D.java b/core/src/processing/core/PGraphicsJava2D.java
index f1e598d..f0b18e0 100644
--- a/core/src/processing/core/PGraphicsJava2D.java
+++ b/core/src/processing/core/PGraphicsJava2D.java
@@ -1310,7 +1310,7 @@
     if (imageMode == CORNERS) {  // if CORNER, do nothing
       // w/h are x2/y2 in this case, bring em down to size
       w = (w - x);
-      h = (h - x);
+      h = (h - y);
     }
 
     if (x < 0) {
