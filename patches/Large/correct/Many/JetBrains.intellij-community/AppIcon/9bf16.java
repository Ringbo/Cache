diff --git a/platform/platform-impl/src/com/intellij/ui/AppIcon.java b/platform/platform-impl/src/com/intellij/ui/AppIcon.java
index 38e4763..f7f2667 100644
--- a/platform/platform-impl/src/com/intellij/ui/AppIcon.java
+++ b/platform/platform-impl/src/com/intellij/ui/AppIcon.java
@@ -280,7 +280,7 @@
         final int y = myAppImage.getHeight() - progressHeight - yInset;
         Shape rect = new RoundRectangle2D.Double(xInset, y, width, progressHeight, progressHeight, progressHeight);
         Shape border = new RoundRectangle2D.Double(xInset - 1, y - 1, width + 2, progressHeight + 2, (progressHeight + 2), (progressHeight + 2));
-        Shape progress = new RoundRectangle2D.Double(xInset + 1, y + 1, (width - 2)  * value, progressHeight - 3, (progressHeight - 2), (progressHeight - 2));
+        Shape progress = new RoundRectangle2D.Double(xInset + 1, y + 1, (width - 2)  * value, progressHeight - 2, (progressHeight - 2), (progressHeight - 2));
         AppImage appImg = createAppImage();
 
         appImg.myG2d.setColor(Color.GRAY.brighter().brighter());
