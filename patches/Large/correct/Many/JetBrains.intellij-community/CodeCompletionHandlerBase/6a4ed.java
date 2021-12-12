diff --git a/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java b/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
index 717dbda..de686c5 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/completion/CodeCompletionHandlerBase.java
@@ -501,7 +501,7 @@
     final Project project = hostFile.getProject();
 
     if (autopopup) {
-      final CompletionPhase.AutoPopupAlarm phase = new CompletionPhase.AutoPopupAlarm(false, hostEditor);
+      final CompletionPhase.AutoPopupAlarm phase = new CompletionPhase.AutoPopupAlarm(true, hostEditor);
       CompletionServiceImpl.setCompletionPhase(phase);
 
       CompletionAutoPopupHandler.runLaterWithCommitted(project, hostDocument, new Runnable() {
