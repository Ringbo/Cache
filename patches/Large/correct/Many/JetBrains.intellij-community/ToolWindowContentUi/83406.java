diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
index b24f57c..4efa655 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
@@ -405,7 +405,7 @@
 
       @Override
       public void mouseDragged(MouseEvent e) {
-        if (myLastPoint.isNull()) return;
+        if (myLastPoint.isNull() || myPressPoint.isNull()) return;
 
         PointerInfo info = MouseInfo.getPointerInfo();
         if (info == null) return;
