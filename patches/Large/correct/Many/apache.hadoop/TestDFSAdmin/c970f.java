diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/tools/TestDFSAdmin.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/tools/TestDFSAdmin.java
index 3ca7fec..63bdf74 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/tools/TestDFSAdmin.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/tools/TestDFSAdmin.java
@@ -234,7 +234,7 @@
     final List<String> outs = Lists.newArrayList();
     final List<String> errs = Lists.newArrayList();
     getReconfigurableProperties("namenode", address, outs, errs);
-    assertEquals(4, outs.size());
+    assertEquals(5, outs.size());
     assertEquals(DFS_HEARTBEAT_INTERVAL_KEY, outs.get(1));
     assertEquals(DFS_NAMENODE_HEARTBEAT_RECHECK_INTERVAL_KEY, outs.get(2));
     assertEquals(errs.size(), 0);
