diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CompletionAutoPopupHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CompletionAutoPopupHandler.java
index e5eaf619..eaa7315 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CompletionAutoPopupHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CompletionAutoPopupHandler.java
@@ -71,7 +71,7 @@
     }
 
     if (!Character.isLetter(charTyped) && charTyped != '_') {
-      if (CompletionServiceImpl.isPhase(CompletionPhase.EmptyAutoPopup.class)) {
+      if (CompletionServiceImpl.isPhase(CompletionPhase.EmptyAutoPopup.class, CompletionPhase.AutoPopupAlarm.class)) {
         CompletionServiceImpl.setCompletionPhase(CompletionPhase.NoCompletion);
       }
       return Result.CONTINUE;
