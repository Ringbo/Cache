diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
index 9805253..ec1c234 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/InsertStatementQueryMethod.java
@@ -58,7 +58,7 @@
             }
 
             ColumnDefinition definition = tableDefinition.getColumnDefinitions().get(i);
-            if (!definition.isPrimaryKeyAutoIncrement || !isInsert) {
+            if (!definition.isPrimaryKeyAutoIncrement || isInsert) {
                 codeBuilder.add(definition.getInsertStatementValuesString());
                 columnCount++;
             }
