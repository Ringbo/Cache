diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetGroupScan.java b/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetGroupScan.java
index 55eed43..af16063 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetGroupScan.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/store/parquet/ParquetGroupScan.java
@@ -425,19 +425,19 @@
     case DATE: {
       NullableDateVector dateVector = (NullableDateVector) v;
       Integer value = (Integer) partitionValueMap.get(f).get(column);
-      dateVector.getMutator().set(index, DateTimeUtils.fromJulianDay(value - ParquetOutputRecordWriter.JULIAN_DAY_EPOC - 0.5));
+      dateVector.getMutator().setSafe(index, DateTimeUtils.fromJulianDay(value - ParquetOutputRecordWriter.JULIAN_DAY_EPOC - 0.5));
       return;
     }
     case TIME: {
       NullableTimeVector timeVector = (NullableTimeVector) v;
       Integer value = (Integer) partitionValueMap.get(f).get(column);
-      timeVector.getMutator().set(index, value);
+      timeVector.getMutator().setSafe(index, value);
       return;
     }
     case TIMESTAMP: {
       NullableTimeStampVector timeStampVector = (NullableTimeStampVector) v;
       Long value = (Long) partitionValueMap.get(f).get(column);
-      timeStampVector.getMutator().set(index, value);
+      timeStampVector.getMutator().setSafe(index, value);
       return;
     }
     case VARCHAR: {
