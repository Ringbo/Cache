diff --git a/test/unit/org/apache/cassandra/db/compaction/NeverPurgeTest.java b/test/unit/org/apache/cassandra/db/compaction/NeverPurgeTest.java
index 5211065..362afe7 100644
--- a/test/unit/org/apache/cassandra/db/compaction/NeverPurgeTest.java
+++ b/test/unit/org/apache/cassandra/db/compaction/NeverPurgeTest.java
@@ -80,7 +80,7 @@
         execute("DELETE FROM %s WHERE a=3");
         cfs.forceBlockingFlush();
         cfs.enableAutoCompaction();
-        while (cfs.getSSTables().size() > 1)
+        while (cfs.getSSTables().size() > 1 || !cfs.getTracker().getCompacting().isEmpty())
             Thread.sleep(100);
         verifyContainsTombstones(cfs.getSSTables(), 3);
     }
