diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/snapshot/RegionServerSnapshotManager.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/snapshot/RegionServerSnapshotManager.java
index 3e5238e..1282585 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/snapshot/RegionServerSnapshotManager.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/snapshot/RegionServerSnapshotManager.java
@@ -347,7 +347,11 @@
       Collection<Future<Void>> tasks = futures;
       LOG.debug("cancelling " + tasks.size() + " tasks for snapshot " + name);
       for (Future<Void> f: tasks) {
-        f.cancel(true);
+        // TODO Ideally we'd interrupt hbase threads when we cancel.  However it seems that there
+        // are places in the HBase code where row/region locks are taken and not released in a
+        // finally block.  Thus we cancel without interrupting.  Cancellations will be slower to
+        // complete but we won't suffer from unreleased locks due to poor code discipline.
+        f.cancel(false);
       }
 
       // evict remaining tasks and futures from taskPool.
