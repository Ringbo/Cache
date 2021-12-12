diff --git a/core/PGraphics.java b/core/PGraphics.java
index d9aed01..776b23a 100644
--- a/core/PGraphics.java
+++ b/core/PGraphics.java
@@ -2004,7 +2004,7 @@
     float spaceWidth = textWidth(' ');
     float runningX = x1; //boxX1;
     float currentY = y1; //boxY1;
-    float boxWidth = x2 - x2; //boxX2 - boxX1;
+    float boxWidth = x2 - x1; //boxX2 - boxX1;
 
     // lineX is the position where the text starts, which is adjusted
     // to left/center/right based on the current textAlign
