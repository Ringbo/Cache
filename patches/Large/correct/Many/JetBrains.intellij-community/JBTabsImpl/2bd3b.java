diff --git a/platform-api/src/com/intellij/ui/tabs/impl/JBTabsImpl.java b/platform-api/src/com/intellij/ui/tabs/impl/JBTabsImpl.java
index f34f5bb..9e0b69d 100644
--- a/platform-api/src/com/intellij/ui/tabs/impl/JBTabsImpl.java
+++ b/platform-api/src/com/intellij/ui/tabs/impl/JBTabsImpl.java
@@ -1534,9 +1534,9 @@
         }
 
         g2d.setColor(tabFillColor);
-        g2d.fill(shaper.reset().doRect(boundsX, topY + shape.path.deltaY(1), boundsWidth, paintBorder.top).getShape());
+        g2d.fill(shaper.reset().doRect(boundsX, topY + shape.path.deltaY(1), boundsWidth, paintBorder.top - 1).getShape());
 
-        if (paintBorder.top >= 1) {
+        if (paintBorder.top > 1) {
           g2d.setColor(borderColor);
           final int topLine = topY + shape.path.deltaY(paintBorder.top - 1);
           g2d.draw(shaper.reset().doRect(boundsX, topLine, boundsWidth - 1, 1).getShape());
