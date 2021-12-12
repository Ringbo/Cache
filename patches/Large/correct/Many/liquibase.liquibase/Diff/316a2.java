diff --git a/core/src/java/liquibase/diff/Diff.java b/core/src/java/liquibase/diff/Diff.java
index 0fd672e..94c0b7e 100644
--- a/core/src/java/liquibase/diff/Diff.java
+++ b/core/src/java/liquibase/diff/Diff.java
@@ -148,7 +148,7 @@
                     && (targetColumn.getView() == null || !diffResult.getUnexpectedViews().contains(targetColumn.getView()))
                     ) {
                 diffResult.addUnexpectedColumn(targetColumn);
-            } else if (targetColumn.getTable() != null) {
+            } else if (targetColumn.getTable() != null && !diffResult.getUnexpectedTables().contains(targetColumn.getTable())) {
                 Column baseColumn = baseSnapshot.getColumn(targetColumn.getTable().getName(), targetColumn.getName());
 
                 if (targetColumn.isDifferent(baseColumn)) {
