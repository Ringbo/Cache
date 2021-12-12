diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/BootstrapStandby.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/BootstrapStandby.java
index a84dcf1..deb76b3 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/BootstrapStandby.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/BootstrapStandby.java
@@ -375,7 +375,7 @@
           "or call saveNamespace on the active node.\n" +
           "Error: " + e.getLocalizedMessage();
       if (LOG.isDebugEnabled()) {
-        LOG.fatal(msg, e);
+        LOG.debug(msg, e);
       } else {
         LOG.fatal(msg);
       }
