diff --git a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
index 02cf433..453176e 100644
--- a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
+++ b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
@@ -493,7 +493,7 @@
                 return false;
             }
 
-            if (i == (ownedRanges.size() - 1))
+            if (i == (sortedRanges.size() - 1))
             {
                 // we're at the last range and we found a key beyond the end of the range
                 return true;
