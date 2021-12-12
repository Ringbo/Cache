diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index 52d4f80..712db37 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -2697,7 +2697,7 @@
                                event.getX(), event.getY(),
                                button, event.getCount());
       }
-      if (button == MouseEvent.RELEASE) {
+      if (action == MouseEvent.RELEASE) {
         macosxLeftButtonWithCtrlPressed = false;
       }
     }
