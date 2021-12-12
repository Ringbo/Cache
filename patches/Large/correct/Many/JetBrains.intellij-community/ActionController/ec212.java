diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/ActionController.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/ActionController.java
index 2366217..ac18850 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/ActionController.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/ActionController.java
@@ -20,10 +20,10 @@
 /**
  * @author erokhins
  */
-public interface ActionController<CommitId> {
+public interface ActionController<Id> {
 
   @NotNull
-  GraphAnswer<CommitId> performAction(@NotNull GraphAction graphAction);
+  GraphAnswer<Id> performAction(@NotNull GraphAction graphAction);
 
   boolean areLongEdgesHidden();
 
