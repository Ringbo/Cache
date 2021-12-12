diff --git a/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java b/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
index 3ac1ddd..c8cd72d 100644
--- a/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
+++ b/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
@@ -185,11 +185,11 @@
         pwriter.print("secureClientPort=");
         pwriter.println(getSecureClientPort());
         pwriter.print("dataDir=");
-        pwriter.println(zkDb.snapLog.getDataDir().getAbsolutePath());
+        pwriter.println(zkDb.snapLog.getSnapDir().getAbsolutePath());
         pwriter.print("dataDirSize=");
         pwriter.println(getDataDirSize());
         pwriter.print("dataLogDir=");
-        pwriter.println(zkDb.snapLog.getSnapDir().getAbsolutePath());
+        pwriter.println(zkDb.snapLog.getDataDir().getAbsolutePath());
         pwriter.print("dataLogSize=");
         pwriter.println(getLogDirSize());
         pwriter.print("tickTime=");
