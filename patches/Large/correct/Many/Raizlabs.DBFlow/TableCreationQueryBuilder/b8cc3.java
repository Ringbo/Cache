diff --git a/DBFlow-Compiler/src/main/java/com/raizlabs/android/dbflow/processor/model/builder/TableCreationQueryBuilder.java b/DBFlow-Compiler/src/main/java/com/raizlabs/android/dbflow/processor/model/builder/TableCreationQueryBuilder.java
index a5af059..663bc2c 100644
--- a/DBFlow-Compiler/src/main/java/com/raizlabs/android/dbflow/processor/model/builder/TableCreationQueryBuilder.java
+++ b/DBFlow-Compiler/src/main/java/com/raizlabs/android/dbflow/processor/model/builder/TableCreationQueryBuilder.java
@@ -22,7 +22,7 @@
      * @return
      */
     public QueryBuilder appendColumn(ColumnDefinition column) {
-        if (column.length> -1) {
+        if (column.length> -1 && !column.isPrimaryKeyAutoIncrement) {
             query.append("(");
             query.append(column.length);
             query.append(")");
