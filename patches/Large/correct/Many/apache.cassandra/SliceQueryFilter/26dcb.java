diff --git a/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java b/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
index ae81f91..acc7855 100644
--- a/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
+++ b/src/java/org/apache/cassandra/db/filter/SliceQueryFilter.java
@@ -211,7 +211,7 @@
             }
         }
 
-        if (toRemote != null)
+        if (toRemove != null)
         {
             for (ByteBuffer columnName : toRemove)
                 cf.remove(columnName);
