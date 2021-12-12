diff --git a/src/java/org/apache/cassandra/db/Memtable.java b/src/java/org/apache/cassandra/db/Memtable.java
index 0050591..db65f01 100644
--- a/src/java/org/apache/cassandra/db/Memtable.java
+++ b/src/java/org/apache/cassandra/db/Memtable.java
@@ -69,7 +69,7 @@
 
         this.cfs = cfs;
         creationTime = System.currentTimeMillis();
-        THRESHOLD = cfs.getMemtableThroughputInMB() * 1024 * 1024;
+        THRESHOLD = cfs.getMemtableThroughputInMB() * 1024L * 1024L;
         THRESHOLD_COUNT = (long) (cfs.getMemtableOperationsInMillions() * 1024 * 1024);
     }
 
