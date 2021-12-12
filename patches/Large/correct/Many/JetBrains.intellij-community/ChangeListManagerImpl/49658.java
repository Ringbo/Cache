diff --git a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
index aa901b9..4af563a 100644
--- a/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
+++ b/source/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
@@ -205,7 +205,7 @@
 
     menuGroup.add(commitAction);
     for (CommitExecutor executor : myExecutors) {
-      modelActionsGroup.add(new CommitUsingExecutorAction(executor));
+      menuGroup.add(new CommitUsingExecutorAction(executor));
     }
 
     menuGroup.add(rollbackAction);
