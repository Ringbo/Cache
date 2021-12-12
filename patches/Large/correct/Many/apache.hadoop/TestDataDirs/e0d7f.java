diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataDirs.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataDirs.java
index c0b4f9a..94af015 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataDirs.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataDirs.java
@@ -51,7 +51,7 @@
     String locations1 = "[disk]/dir0,[DISK]/dir1,[sSd]/dir2,[disK]/dir3,[ram_disk]/dir4";
     conf.set(DFS_DATANODE_DATA_DIR_KEY, locations1);
     locations = DataNode.getStorageLocations(conf);
-    assertThat(locations.size(), is(4));
+    assertThat(locations.size(), is(5));
     assertThat(locations.get(0).getStorageType(), is(StorageType.DISK));
     assertThat(locations.get(0).getUri(), is(dir0.toURI()));
     assertThat(locations.get(1).getStorageType(), is(StorageType.DISK));
