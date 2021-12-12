diff --git a/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java b/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
index a26fdfa..f82b4d3 100644
--- a/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
+++ b/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
@@ -262,7 +262,7 @@
           changeListWorker.notifyDoneProcessingChanges(myListeners);
         }
         if (updateUnversionedFiles) {
-          boolean statusChanged = myComposite.equals(composite);
+          boolean statusChanged = !myComposite.equals(composite);
           myComposite = composite;
           if (statusChanged) {
             myListeners.getMulticaster().unchangedFileStatusChanged();
