diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/BackupImage.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/BackupImage.java
index c6ae0d5..450ddee 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/BackupImage.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/BackupImage.java
@@ -200,7 +200,7 @@
     assert backupInputStream.length() == 0 : "backup input stream is not empty";
     try {
       if (LOG.isTraceEnabled()) {
-        LOG.debug("data:" + StringUtils.byteToHexString(data));
+        LOG.trace("data:" + StringUtils.byteToHexString(data));
       }
 
       FSEditLogLoader logLoader =
