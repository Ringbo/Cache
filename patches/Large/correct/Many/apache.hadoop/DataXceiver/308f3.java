diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
index 0bb1987..53d650d 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
@@ -313,7 +313,8 @@
         } else {
           LOG.info("{}; {}", s1, t.toString());
         }
-      } else if (t instanceof InvalidToken) {
+      } else if (t instanceof InvalidToken ||
+          t.getCause() instanceof InvalidToken) {
         // The InvalidToken exception has already been logged in
         // checkAccess() method and this is not a server error.
         LOG.trace(s, t);
