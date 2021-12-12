diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/LinuxContainerExecutor.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/LinuxContainerExecutor.java
index 2aaa835..b3e13b4 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/LinuxContainerExecutor.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/LinuxContainerExecutor.java
@@ -307,7 +307,7 @@
           .getConfiguredResourceHandlerChain(conf);
       if (LOG.isDebugEnabled()) {
         LOG.debug("Resource handler chain enabled = " + (resourceHandlerChain
-            == null));
+            != null));
       }
       if (resourceHandlerChain != null) {
         LOG.debug("Bootstrapping resource handler chain");
