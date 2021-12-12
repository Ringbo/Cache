diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
index ec1c234..606b286 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
@@ -41,7 +41,7 @@
                 codeBuilder.add(",");
             }
 
-            if (!column.isPrimaryKeyAutoIncrement || !isInsert) {
+            if (!column.isPrimaryKeyAutoIncrement || isInsert) {
                 codeBuilder.add(column.getInsertStatementColumnName());
                 columnCount++;
             }
