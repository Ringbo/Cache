diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestFileChecksum.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestFileChecksum.java
index 908ab0c..8f83ba5 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestFileChecksum.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestFileChecksum.java
@@ -479,7 +479,7 @@
     }
 
     if (dnIdxToDie != -1) {
-      cluster.restartDataNode(dnIdxToDie, true);
+      cluster.restartDataNode(dnIdxToDie);
     }
 
     return fc;
