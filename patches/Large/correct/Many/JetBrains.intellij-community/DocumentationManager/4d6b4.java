diff --git a/platform/lang-impl/src/com/intellij/codeInsight/documentation/DocumentationManager.java b/platform/lang-impl/src/com/intellij/codeInsight/documentation/DocumentationManager.java
index 2b42e70..44cab6a 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/documentation/DocumentationManager.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/documentation/DocumentationManager.java
@@ -171,7 +171,7 @@
       @Override
       public void beforeEditorTyping(char c, DataContext dataContext) {
         final JBPopup hint = getDocInfoHint();
-        if (hint != null) {
+        if (hint != null && LookupManager.getActiveLookup(myEditor) == null) {
           hint.cancel();
         }
       }
