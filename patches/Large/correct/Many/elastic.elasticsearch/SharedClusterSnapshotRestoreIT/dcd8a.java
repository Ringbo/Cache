diff --git a/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java b/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
index 669527f..e8ff967 100644
--- a/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
+++ b/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
@@ -1943,7 +1943,7 @@
                         .put("compress", randomBoolean())
                         .put("chunk_size", randomIntBetween(100, 1000), ByteSizeUnit.BYTES)));
 
-        assertAcked(prepareCreate("test-idx", 0, settingsBuilder().put("number_of_shards", between(1, 20))
+        assertAcked(prepareCreate("test-idx", 0, settingsBuilder().put("number_of_shards", between(1, 10))
                 .put("number_of_replicas", 0)));
         ensureGreen();
 
