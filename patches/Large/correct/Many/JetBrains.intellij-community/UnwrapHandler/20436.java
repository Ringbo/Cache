diff --git a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
index eb298c3..897a677 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapHandler.java
@@ -82,7 +82,9 @@
   protected void selectOption(List<AnAction> options, Editor editor, PsiFile file) {
     if (options.isEmpty()) return;
 
-    if (!getUnwrapDescription(file).showOptionsDialog()) {
+    if (!getUnwrapDescription(file).showOptionsDialog() ||
+        ApplicationManager.getApplication().isUnitTestMode()
+       ) {
       options.get(0).actionPerformed(null);
       return;
     }
