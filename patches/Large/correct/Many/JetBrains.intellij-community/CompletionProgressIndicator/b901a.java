diff --git a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionProgressIndicator.java b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionProgressIndicator.java
index 9357e65..0e6251e 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionProgressIndicator.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionProgressIndicator.java
@@ -575,8 +575,7 @@
   public void restartCompletion() {
     closeAndFinish(false);
 
-    final CodeCompletionHandlerBase newHandler = new CodeCompletionHandlerBase(myParameters.getCompletionType(), false,
-                                                                               !isAutopopupCompletion());
+    final CodeCompletionHandlerBase newHandler = new CodeCompletionHandlerBase(myParameters.getCompletionType(), false, isAutopopupCompletion());
     final PsiFile psiFileInEditor = PsiUtilBase.getPsiFileInEditor(myEditor, getProject());
     newHandler.invokeCompletion(getProject(), myEditor, psiFileInEditor, myParameters.getInvocationCount());
   }
