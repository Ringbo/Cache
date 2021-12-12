diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
index 107ce5d..66ecdbc 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
@@ -137,7 +137,7 @@
     if (removedVols != null && removedVols.size() > 0) {
       // Replace volume list
       volumes = Collections.unmodifiableList(volumeList);
-      FsDatasetImpl.LOG.info("Completed checkDirs. Removed " + removedVols.size()
+      FsDatasetImpl.LOG.warn("Completed checkDirs. Removed " + removedVols.size()
           + " volumes. Current volumes: " + this);
     }
 
