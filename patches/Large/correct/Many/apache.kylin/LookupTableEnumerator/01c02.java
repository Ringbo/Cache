diff --git a/query/src/main/java/org/apache/kylin/query/enumerator/LookupTableEnumerator.java b/query/src/main/java/org/apache/kylin/query/enumerator/LookupTableEnumerator.java
index 9df5557..1500def 100644
--- a/query/src/main/java/org/apache/kylin/query/enumerator/LookupTableEnumerator.java
+++ b/query/src/main/java/org/apache/kylin/query/enumerator/LookupTableEnumerator.java
@@ -86,7 +86,7 @@
                 ColumnDesc colDesc = colDescs.get(i);
                 int colIdx = colDesc.getZeroBasedIndex();
                 if (colIdx >= 0) {
-                    current[i] = Tuple.convertOptiqCellValue(row[colIdx], colDesc.getType().getName());
+                    current[i] = Tuple.convertOptiqCellValue(row[colIdx], colDesc.getUpgradedType().getName());
                 } else {
                     current[i] = null; // fake column
                 }
