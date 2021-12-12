diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
index b118ecd..fa69d63 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
@@ -1844,7 +1844,7 @@
         // Update metrics.
         postAppend(entry, EnvironmentEdgeManager.currentTime() - start);
       } catch (Exception e) {
-        LOG.fatal("Could not append. Requesting close of wal", e);
+        LOG.warn("Could not append. Requesting close of wal", e);
         requestLogRoll();
         throw e;
       }
