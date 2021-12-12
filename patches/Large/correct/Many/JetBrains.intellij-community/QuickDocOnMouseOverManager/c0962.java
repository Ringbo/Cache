diff --git a/platform/lang-impl/src/com/intellij/codeInsight/documentation/QuickDocOnMouseOverManager.java b/platform/lang-impl/src/com/intellij/codeInsight/documentation/QuickDocOnMouseOverManager.java
index 7a23e2f..f10ecdc 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/documentation/QuickDocOnMouseOverManager.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/documentation/QuickDocOnMouseOverManager.java
@@ -155,7 +155,7 @@
   }
   
   private void processMouseMove(@NotNull EditorMouseEvent e) {
-    if (!myApplicationActive || e.getArea() != EditorMouseEventArea.EDITING_AREA) {
+    if (!myApplicationActive || !myEnabled || e.getArea() != EditorMouseEventArea.EDITING_AREA) {
       // Skip if the mouse is not at the editing area.
       closeQuickDocIfPossible();
       return;
