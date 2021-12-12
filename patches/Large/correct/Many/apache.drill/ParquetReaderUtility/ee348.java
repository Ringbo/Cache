diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetReaderUtility.java b/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetReaderUtility.java
index 470cc00..767c98d 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetReaderUtility.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetReaderUtility.java
@@ -196,7 +196,7 @@
     } else {
       // Possibly an old, un-migrated Drill file, check the column statistics to see if min/max values look corrupt
       // only applies if there is a date column selected
-      if (createdBy.equals("parquet-mr")) {
+      if (createdBy == null || createdBy.equals("parquet-mr")) {
         // loop through parquet column metadata to find date columns, check for corrupt values
         return checkForCorruptDateValuesInStatistics(footer, columns, autoCorrectCorruptDates);
       } else {
