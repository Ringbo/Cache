diff --git a/src/java/org/apache/cassandra/db/SliceFromReadCommand.java b/src/java/org/apache/cassandra/db/SliceFromReadCommand.java
index a9bbaf0..889038d 100644
--- a/src/java/org/apache/cassandra/db/SliceFromReadCommand.java
+++ b/src/java/org/apache/cassandra/db/SliceFromReadCommand.java
@@ -77,8 +77,9 @@
 
         int count = filter.count;
         // We generate a retry if at least one node reply with count live columns but after merge we have less
-        // than the total number of column we are interested in (which may be < count on a retry)
-        if (maxLiveColumns >= count)
+        // than the total number of column we are interested in (which may be < count on a retry).
+        // So in particular, if no host returned count live columns, we know it's not a short read.
+        if (maxLiveColumns < count)
             return null;
 
         int liveCountInRow = row == null || row.cf == null ? 0 : filter.getLiveCount(row.cf);
