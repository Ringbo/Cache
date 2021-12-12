diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateState.java b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateState.java
index 28da158..e80b060 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateState.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/TemplateState.java
@@ -351,9 +351,9 @@
     }
   }
 
-  private TemplateImpl substituteTemplate(final PsiFile file, int caretOffset, TemplateImpl template) {
+  private static TemplateImpl substituteTemplate(final PsiFile file, int caretOffset, TemplateImpl template) {
     for (TemplateSubstitutor substitutor : Extensions.getExtensions(TemplateSubstitutor.EP_NAME)) {
-      final TemplateImpl substituted = substitutor.substituteTemplate(myEditor, file, caretOffset, template);
+      final TemplateImpl substituted = substitutor.substituteTemplate(file, caretOffset, template);
       if (substituted != null) {
         template = substituted;
       }
