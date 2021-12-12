diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/snapshot/SnapshotManager.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/snapshot/SnapshotManager.java
index ef41b96..878df28 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/snapshot/SnapshotManager.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/snapshot/SnapshotManager.java
@@ -97,7 +97,7 @@
           + "Please redo the operation after removing all the snapshots.");
     }
 
-    final INodeDirectory d = new INodeDirectory(s);
+    final INodeDirectory d = new INodeDirectory(s, true);
     fsdir.replaceINodeDirectory(path, s, d);
     snapshottables.remove(s);
 
@@ -198,7 +198,7 @@
      */
     private INodeDirectory processINodeDirectory(final INodeDirectory srcChild
         ) throws IOException {
-      final INodeDirectory dstChild = new INodeDirectory(srcChild);
+      final INodeDirectory dstChild = new INodeDirectory(srcChild, false);
       dstChild.setChildren(null);
       processRecursively(srcChild, dstChild);
       return dstChild;
