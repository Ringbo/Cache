diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/VcsLogGraphTable.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/VcsLogGraphTable.java
index 7d1721bd..0e50899 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/VcsLogGraphTable.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/frame/VcsLogGraphTable.java
@@ -567,7 +567,7 @@
 
     private void performAction(@NotNull MouseEvent e, @NotNull final GraphAction.Type actionType) {
       int row = PositionUtil.getRowIndex(e.getPoint(), getRowHeight());
-      if (row > getRowCount() - 1) {
+      if (row < 0 || row > getRowCount() - 1) {
         return;
       }
       Point point = calcPoint4Graph(e.getPoint());
