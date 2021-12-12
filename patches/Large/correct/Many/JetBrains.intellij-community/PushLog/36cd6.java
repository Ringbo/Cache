diff --git a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
index 78a90f2..ffde6af 100644
--- a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
+++ b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
@@ -231,7 +231,7 @@
   public void calcData(DataKey key, DataSink sink) {
     if (VcsDataKeys.CHANGES.equals(key)) {
       int[] rows = myTree.getSelectionRows();
-      if (rows.length != 0) {
+      if (rows != null && rows.length != 0) {
         Collection<Change> changes = collectAllChanges(rows);
         sink.put(key, ArrayUtil.toObjectArray(changes, Change.class));
       }
