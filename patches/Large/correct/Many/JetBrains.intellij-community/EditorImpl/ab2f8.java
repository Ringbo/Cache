diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 2938c5a..84df9dc 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -1618,7 +1618,7 @@
   public void startDumb() {
     if (ApplicationManager.getApplication().isUnitTestMode()) return;
     Rectangle rect = ((JViewport)myEditorComponent.getParent()).getViewRect();
-    BufferedImage image = UIUtil.createImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
+    BufferedImage image = UIUtil.createImage(myEditorComponent, rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
     Graphics2D graphics = image.createGraphics();
     graphics.translate(-rect.x, -rect.y);
     graphics.setClip(rect.x, rect.y, rect.width, rect.height);
