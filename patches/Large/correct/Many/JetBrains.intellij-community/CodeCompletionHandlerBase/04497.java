diff --git a/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java b/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
index 5f349b2..2c8a6ab 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
@@ -680,7 +680,7 @@
     if (context.getCompletionChar() == Lookup.COMPLETE_STATEMENT_SELECT_CHAR) {
       Language language = PsiUtilBase.getLanguageInEditor(editor, indicator.getProject());
       if (language != null) {
-        for (SmartEnterProcessor processor : SmartEnterProcessors.INSTANCE.forKey(language)) {
+        for (SmartEnterProcessor processor : SmartEnterProcessors.INSTANCE.allForLanguage(language)) {
           if (processor.processAfterCompletion(editor, indicator.getParameters().getOriginalFile())) break;
         }
       }
