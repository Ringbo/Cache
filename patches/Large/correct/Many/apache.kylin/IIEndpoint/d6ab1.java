diff --git a/storage/src/main/java/org/apache/kylin/storage/hbase/coprocessor/endpoint/IIEndpoint.java b/storage/src/main/java/org/apache/kylin/storage/hbase/coprocessor/endpoint/IIEndpoint.java
index 9d29bf8..45c1bb1 100644
--- a/storage/src/main/java/org/apache/kylin/storage/hbase/coprocessor/endpoint/IIEndpoint.java
+++ b/storage/src/main/java/org/apache/kylin/storage/hbase/coprocessor/endpoint/IIEndpoint.java
@@ -241,13 +241,13 @@
         for (int i = 0; i < columnSize; i++) {
             final TblColRef column = columns[i];
             if (isMetric[i]) {
-                rowKeyColumnIO.writeColumnWith(encodedRecord.getBytes(), encodedRecord.offset(i), encodedRecord.length(i), recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
+                rowKeyColumnIO.writeColumnWithoutDictionary(encodedRecord.getBytes(), encodedRecord.offset(i), encodedRecord.length(i), recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
             } else {
                 if (emptyDictionary) {
-                    rowKeyColumnIO.writeColumnWith(encodedRecord.getBytes(), encodedRecord.offset(i), encodedRecord.length(i), recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
+                    rowKeyColumnIO.writeColumnWithoutDictionary(encodedRecord.getBytes(), encodedRecord.offset(i), encodedRecord.length(i), recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
                 } else {
                     final int length = localDictionaries[i].getValueBytesFromId(encodedRecord.getValueID(i), buffer, 0);
-                    rowKeyColumnIO.writeColumnWith(buffer, 0, length, recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
+                    rowKeyColumnIO.writeColumnWithoutDictionary(buffer, 0, length, recordBuffer, digest.offset(i), rowKeyColumnIO.getColumnLength(column));
                 }
             }
         }
