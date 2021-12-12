diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/snapshot/TestINodeDirectoryWithSnapshot.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/snapshot/TestINodeDirectoryWithSnapshot.java
index 1e8ac0f..0835a3b 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/snapshot/TestINodeDirectoryWithSnapshot.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/namenode/snapshot/TestINodeDirectoryWithSnapshot.java
@@ -220,7 +220,7 @@
     final int i = Diff.search(current, inode);
     Assert.assertTrue(i >= 0);
     final INodeDirectory oldinode = (INodeDirectory)current.get(i);
-    final INodeDirectory newinode = new INodeDirectory(oldinode);
+    final INodeDirectory newinode = new INodeDirectory(oldinode, true);
     newinode.setModificationTime(oldinode.getModificationTime() + 1);
 
     current.set(i, newinode);
