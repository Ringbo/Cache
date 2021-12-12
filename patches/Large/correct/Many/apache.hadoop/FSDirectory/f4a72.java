diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSDirectory.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSDirectory.java
index 6403955..1dda45c 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSDirectory.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/FSDirectory.java
@@ -2008,7 +2008,7 @@
         ((INodeDirectoryWithQuota)dirNode).setQuota(nsQuota, dsQuota);
         if (!dirNode.isQuotaSet()) {
           // will not come here for root because root's nsQuota is always set
-          INodeDirectory newNode = new INodeDirectory(dirNode);
+          INodeDirectory newNode = new INodeDirectory(dirNode, true);
           INodeDirectory parent = (INodeDirectory)inodes[inodes.length-2];
           dirNode = newNode;
           parent.replaceChild(newNode);
