diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
index b506710..c02603d 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/FsVolumeList.java
@@ -213,7 +213,7 @@
 
   @Override
   public String toString() {
-    return volumes.toString();
+    return Arrays.toString(volumes.get());
   }
 
   /**
