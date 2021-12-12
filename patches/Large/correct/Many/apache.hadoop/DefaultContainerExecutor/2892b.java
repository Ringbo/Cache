diff --git a/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/DefaultContainerExecutor.java b/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/DefaultContainerExecutor.java
index bd95317..3d46053 100644
--- a/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/DefaultContainerExecutor.java
+++ b/hadoop-mapreduce-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/DefaultContainerExecutor.java
@@ -75,7 +75,7 @@
   }
   
   @Override
-  public void startLocalizer(Path nmPrivateContainerTokensPath,
+  public synchronized void startLocalizer(Path nmPrivateContainerTokensPath,
       InetSocketAddress nmAddr, String user, String appId, String locId,
       List<String> localDirs, List<String> logDirs)
       throws IOException, InterruptedException {
