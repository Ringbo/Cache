diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ex/QuickFixAction.java b/platform/lang-impl/src/com/intellij/codeInspection/ex/QuickFixAction.java
index df81d62..9faf542 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ex/QuickFixAction.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ex/QuickFixAction.java
@@ -174,7 +174,7 @@
       PerformFixesTask performFixesTask = new PerformFixesTask(project, descriptors, ignoredElements, context);
       if (startInWriteAction) {
         ((ApplicationImpl)ApplicationManager.getApplication())
-          .runWriteActionWithNonCancellableProgressInDispatchThread(templatePresentationText, project, null, performFixesTask::doRun);
+          .runWriteActionWithCancellableProgressInDispatchThread(templatePresentationText, project, null, performFixesTask::doRun);
       }
       else {
         final SequentialModalProgressTask progressTask =
