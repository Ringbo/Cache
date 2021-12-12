diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/AutoHardWrapHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/AutoHardWrapHandler.java
index 4c24ff5..6184c67 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/AutoHardWrapHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/AutoHardWrapHandler.java
@@ -118,7 +118,7 @@
     }
 
     VisualPosition visEndLinePosition = editor.offsetToVisualPosition(endOffset);
-    if (margin > visEndLinePosition.column) {
+    if (margin >= visEndLinePosition.column) {
       if (change != null) {
         change.modificationStamp = document.getModificationStamp();
       }
