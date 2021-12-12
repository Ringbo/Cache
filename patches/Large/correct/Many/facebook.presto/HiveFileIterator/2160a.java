diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/util/HiveFileIterator.java b/presto-hive/src/main/java/com/facebook/presto/hive/util/HiveFileIterator.java
index 5d34229..7dd7926 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/util/HiveFileIterator.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/util/HiveFileIterator.java
@@ -97,7 +97,7 @@
             throw new PrestoException(HIVE_FILE_NOT_FOUND, "Partition location does not exist: " + path);
         }
         catch (IOException e) {
-            throw new PrestoException(HIVE_FILESYSTEM_ERROR, e);
+            throw new PrestoException(HIVE_FILESYSTEM_ERROR, "Failed to list directory: " + path, e);
         }
     }
 
