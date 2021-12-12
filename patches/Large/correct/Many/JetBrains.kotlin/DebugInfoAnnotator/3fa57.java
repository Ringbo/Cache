diff --git a/idea/src/org/jetbrains/jet/plugin/annotations/DebugInfoAnnotator.java b/idea/src/org/jetbrains/jet/plugin/annotations/DebugInfoAnnotator.java
index f0d8b73..bade37c 100644
--- a/idea/src/org/jetbrains/jet/plugin/annotations/DebugInfoAnnotator.java
+++ b/idea/src/org/jetbrains/jet/plugin/annotations/DebugInfoAnnotator.java
@@ -46,7 +46,7 @@
 
     @Override
     public void annotate(@NotNull PsiElement element, @NotNull final AnnotationHolder holder) {
-        if (!debugInfoEnabled) {
+        if (!debugInfoEnabled || !JetPsiChecker.isErrorReportingEnabled()) {
             return;
         }
         
