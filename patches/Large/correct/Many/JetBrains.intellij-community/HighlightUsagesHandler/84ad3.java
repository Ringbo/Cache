diff --git a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/HighlightUsagesHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/HighlightUsagesHandler.java
index 6b94a3f..0576f1d 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/HighlightUsagesHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/HighlightUsagesHandler.java
@@ -82,7 +82,7 @@
 
     if (usageTargets == null) {
       PsiElement targetElement = getTargetElement(editor, file);
-      if (targetElement != null) {
+      if (targetElement != null && targetElement != file) {
         if (!(targetElement instanceof NavigationItem)) {
           targetElement = targetElement.getNavigationElement();
         }
