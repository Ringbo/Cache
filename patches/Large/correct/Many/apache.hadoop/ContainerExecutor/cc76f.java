diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/ContainerExecutor.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/ContainerExecutor.java
index 3d3aefd..ee72fbc 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/ContainerExecutor.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/main/java/org/apache/hadoop/yarn/server/nodemanager/ContainerExecutor.java
@@ -218,7 +218,7 @@
         retCommand.addAll(Arrays.asList("nice", "-n",
             Integer.toString(containerSchedPriorityAdjustment)));
       }
-      retCommand.addAll(Arrays.asList("bash", "-c", command));
+      retCommand.addAll(Arrays.asList("bash", command));
       return retCommand.toArray(new String[retCommand.size()]);
     }
 
