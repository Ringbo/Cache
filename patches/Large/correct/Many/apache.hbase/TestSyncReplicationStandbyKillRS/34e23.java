diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/replication/TestSyncReplicationStandbyKillRS.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/replication/TestSyncReplicationStandbyKillRS.java
index 3c9724f..d659688 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/replication/TestSyncReplicationStandbyKillRS.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/replication/TestSyncReplicationStandbyKillRS.java
@@ -90,7 +90,7 @@
       UTIL2.getAdmin().transitReplicationPeerSyncReplicationState(PEER_ID,
           SyncReplicationState.DOWNGRADE_ACTIVE);
     } catch (Exception e) {
-      LOG.error("Failed to transit standby cluster to " + SyncReplicationState.DOWNGRADE_ACTIVE);
+      LOG.error("Failed to transit standby cluster to " + SyncReplicationState.DOWNGRADE_ACTIVE, e);
     }
 
     while (UTIL2.getAdmin().getReplicationPeerSyncReplicationState(PEER_ID)
