diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java b/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
index a299216..cd2cfe3 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/tuple/Tuple.java
@@ -178,7 +178,7 @@
         if (partitionCol.getDatatype().equals("date")) {
             return epicDaysToMillis(Integer.valueOf(row.getValue(partitionCol).toString()));
         } else {
-            return Long.valueOf(row.getValue(partitionCol).toString());
+            return Long.parseLong(row.getValue(partitionCol).toString());
         }
     }
 
