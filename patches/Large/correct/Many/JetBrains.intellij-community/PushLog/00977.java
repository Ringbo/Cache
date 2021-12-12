diff --git a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
index 925ac9c..e400059 100644
--- a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
+++ b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
@@ -182,7 +182,7 @@
 
   private void updateChangesView() {
     int[] rows = myTree.getSelectionRows();
-    if (rows.length != 0) {
+    if (rows != null && rows.length != 0) {
       myChangesBrowser.getViewer().setEmptyText("No differences");
       myChangesBrowser.setChangesToDisplay(collectAllChanges(rows));
     }
