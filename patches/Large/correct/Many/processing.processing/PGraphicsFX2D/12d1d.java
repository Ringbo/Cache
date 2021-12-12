diff --git a/core/src/processing/javafx/PGraphicsFX2D.java b/core/src/processing/javafx/PGraphicsFX2D.java
index d169cde..972dcac 100644
--- a/core/src/processing/javafx/PGraphicsFX2D.java
+++ b/core/src/processing/javafx/PGraphicsFX2D.java
@@ -1437,7 +1437,7 @@
 
   @Override
   public void rotate(float angle) {
-    context.rotate(PApplet.radians(angle));
+    context.rotate(PApplet.degrees(angle));
   }
 
 
