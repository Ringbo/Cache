diff --git a/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java b/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
index 6c2aeb4..bad5ea2 100644
--- a/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
+++ b/metastore/src/java/org/apache/hadoop/hive/metastore/HiveMetaStore.java
@@ -3104,7 +3104,7 @@
       try {
         statsObj = getMS().getTableColumnStatistics(dbName, tableName, colName);
       } finally {
-        endFunction("get_column_statistics_by_table: ", statsObj != null);
+        endFunction("get_column_statistics_by_table: ", statsObj != null, null);
       }
       return statsObj;
     }
@@ -3126,7 +3126,7 @@
         statsObj = getMS().getPartitionColumnStatistics(dbName, tableName, convertedPartName,
                                                             partVals, colName);
       } finally {
-        endFunction("get_column_statistics_by_partition: ", statsObj != null);
+        endFunction("get_column_statistics_by_partition: ", statsObj != null, null);
       }
       return statsObj;
    }
@@ -3165,7 +3165,7 @@
         ret = getMS().updateTableColumnStatistics(colStats);
         return ret;
       } finally {
-        endFunction("write_column_statistics: ", ret != false);
+        endFunction("write_column_statistics: ", ret != false, null);
       }
     }
 
@@ -3211,7 +3211,7 @@
         ret = getMS().updatePartitionColumnStatistics(colStats, partVals);
         return ret;
       } finally {
-        endFunction("write_partition_column_statistics: ", ret != false);
+        endFunction("write_partition_column_statistics: ", ret != false, null);
       }
     }
 
@@ -3234,7 +3234,7 @@
         ret = getMS().deletePartitionColumnStatistics(dbName, tableName,
                                                       convertedPartName, partVals, colName);
       } finally {
-        endFunction("delete_column_statistics_by_partition: ", ret != false);
+        endFunction("delete_column_statistics_by_partition: ", ret != false, null);
       }
       return ret;
     }
@@ -3256,7 +3256,7 @@
       try {
         ret = getMS().deleteTableColumnStatistics(dbName, tableName, colName);
       } finally {
-        endFunction("delete_column_statistics_by_table: ", ret != false);
+        endFunction("delete_column_statistics_by_table: ", ret != false, null);
       }
       return ret;
    }
