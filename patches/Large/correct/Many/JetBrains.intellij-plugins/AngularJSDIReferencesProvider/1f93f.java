diff --git a/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSDIReferencesProvider.java b/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSDIReferencesProvider.java
index 4deafa9..304a80b 100644
--- a/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSDIReferencesProvider.java
+++ b/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSDIReferencesProvider.java
@@ -38,7 +38,7 @@
       final String name = getCanonicalText();
       final PsiFile psiFile = getElement().getContainingFile();
       final WalkUpResolveProcessor processor = new WalkUpResolveProcessor(
-        name, BaseJSSymbolProcessor.EMPTY_CONTEXT,
+        name,
         psiFile,
         getElement(),
         BaseJSSymbolProcessor.MatchMode.Any
