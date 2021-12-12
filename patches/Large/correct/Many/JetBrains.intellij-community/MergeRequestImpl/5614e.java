diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeRequestImpl.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeRequestImpl.java
index 6798ec9..9e88912 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeRequestImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeRequestImpl.java
@@ -236,7 +236,7 @@
     }
   }
 
-  private class AllResolvedListener implements ChangeCounter.Listener, Runnable {
+  private static class AllResolvedListener implements ChangeCounter.Listener, Runnable {
     private final MergePanel2 myMergePanel;
     private final DialogWrapper myDialogWrapper;
     private boolean myWasInvoked = false;
@@ -255,7 +255,7 @@
       myWasInvoked = true;
       ChangeCounter.getOrCreate(myMergePanel.getMergeList()).removeListener(this);
       int doApply = Messages
-        .showOkCancelDialog(getProject(), DiffBundle.message("merge.all.changes.have.processed.save.and.finish.confirmation.text"),
+        .showOkCancelDialog(getWholePanel(), DiffBundle.message("merge.all.changes.have.processed.save.and.finish.confirmation.text"),
                     DiffBundle.message("all.changes.processed.dialog.title"),
                     DiffBundle.message("merge.save.and.finish.button"), DiffBundle.message("merge.continue.button"),
                     Messages.getQuestionIcon());
