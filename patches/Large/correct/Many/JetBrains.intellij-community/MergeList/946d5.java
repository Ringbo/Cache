diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/MergeList.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/MergeList.java
index 7e3ed70..c411677 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/MergeList.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/MergeList.java
@@ -237,13 +237,13 @@
       if (!change.canHasActions(originalSide)) continue;
       AnAction applyAction = new AnAction(DiffBundle.message("merge.dialog.apply.change.action.name"), null, AllIcons.Diff.Arrow) {
         @Override
-        public void actionPerformed(@NotNull AnActionEvent e) {
+        public void actionPerformed(@Nullable AnActionEvent e) {
           apply(change);
         }
       };
       AnAction ignoreAction = new AnAction(DiffBundle.message("merge.dialog.ignore.change.action.name"), null, AllIcons.Diff.Remove) {
         @Override
-        public void actionPerformed(@NotNull AnActionEvent e) {
+        public void actionPerformed(@Nullable AnActionEvent e) {
           change.removeFromList();
         }
       };
