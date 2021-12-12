diff --git a/platform/platform-api/src/com/intellij/ide/wizard/AbstractWizard.java b/platform/platform-api/src/com/intellij/ide/wizard/AbstractWizard.java
index d52b65b..c3605e2 100644
--- a/platform/platform-api/src/com/intellij/ide/wizard/AbstractWizard.java
+++ b/platform/platform-api/src/com/intellij/ide/wizard/AbstractWizard.java
@@ -217,13 +217,13 @@
       myIcon.paintIcon(this, gg, 0, 0);
 
       final Rectangle bounds = g.getClipBounds();
-      int y = myIcon.getIconHeight()-10;
+      int y = myIcon.getIconHeight()-1;
       while (y < bounds.y + bounds.height) {
         g.drawImage(image,
-                    bounds.x, y, bounds.x + bounds.width, y + 5,
-                    0, myIcon.getIconHeight() - 15, bounds.width, myIcon.getIconHeight() - 10, this);
+                    bounds.x, y, bounds.x + bounds.width, y + 1,
+                    0, myIcon.getIconHeight() - 1, bounds.width, myIcon.getIconHeight(), this);
 
-        y += 5;
+        y++;
       }
 
 
