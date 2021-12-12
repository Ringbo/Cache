diff --git a/src/java/org/apache/cassandra/db/Memtable.java b/src/java/org/apache/cassandra/db/Memtable.java
index a524ff3..6b7a3d0 100644
--- a/src/java/org/apache/cassandra/db/Memtable.java
+++ b/src/java/org/apache/cassandra/db/Memtable.java
@@ -296,6 +296,6 @@
 
     public boolean isExpired()
     {
-        return System.currentTimeMillis() > creationTime + cfs.getMemtableFlushAfterMins() * 60 * 1000;
+        return System.currentTimeMillis() > creationTime + cfs.getMemtableFlushAfterMins() * 60 * 1000L;
     }
 }
