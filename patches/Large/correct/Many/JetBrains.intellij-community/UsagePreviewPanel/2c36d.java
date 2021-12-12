diff --git a/platform/usageView/src/com/intellij/usages/impl/UsagePreviewPanel.java b/platform/usageView/src/com/intellij/usages/impl/UsagePreviewPanel.java
index 0a8ebc2..64f968b 100644
--- a/platform/usageView/src/com/intellij/usages/impl/UsagePreviewPanel.java
+++ b/platform/usageView/src/com/intellij/usages/impl/UsagePreviewPanel.java
@@ -122,7 +122,7 @@
       public void run() {
         if (project.isDisposed()) return;
         //noinspection ConstantConditions
-        if (editor1 == editor) {
+        if (editor1 == editor && !editor.isDisposed()) {
           doHighlight(infos, editor, project);
         }
       }
