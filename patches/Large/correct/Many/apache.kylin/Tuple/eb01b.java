diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java b/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
index cd2cfe3..86db79b 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
@@ -176,7 +176,7 @@
     public static long getTs(ITuple row, TblColRef partitionCol) {
         //ts column type differentiate
         if (partitionCol.getDatatype().equals("date")) {
-            return epicDaysToMillis(Integer.valueOf(row.getValue(partitionCol).toString()));
+            return epicDaysToMillis(Integer.parseInt(row.getValue(partitionCol).toString()));
         } else {
             return Long.parseLong(row.getValue(partitionCol).toString());
         }
