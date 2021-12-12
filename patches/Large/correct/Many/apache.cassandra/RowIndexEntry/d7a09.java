diff --git a/src/java/org/apache/cassandra/db/RowIndexEntry.java b/src/java/org/apache/cassandra/db/RowIndexEntry.java
index c6caa3a..d5046a8 100644
--- a/src/java/org/apache/cassandra/db/RowIndexEntry.java
+++ b/src/java/org/apache/cassandra/db/RowIndexEntry.java
@@ -206,7 +206,7 @@
             for (IndexHelper.IndexInfo idx : columnsIndex)
                 internal += idx.memorySize();
             long listSize = ObjectSizes.getFieldSize(ObjectSizes.getArraySize(columnsIndex.size(), internal) + 4);
-            return ObjectSizes.getFieldSize(deletionInfo.memorySize() + listSize);
+            return ObjectSizes.getFieldSize(deletion.memorySize() + listSize);
         }
     }
 }
