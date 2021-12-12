diff --git a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
index 87cef88..29b4891 100644
--- a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
+++ b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
@@ -386,7 +386,7 @@
               }
             }
             finally {
-              if (myDisposed) {
+              if (!myDisposed) {
                 synchronized (myChangeLists) {
                   for (ChangeList list : myChangeLists) {
                     if (list.doneProcessingChanges()) {
