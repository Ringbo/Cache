diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/TestFairScheduler.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/TestFairScheduler.java
index ec77a9b..9f22e50 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/TestFairScheduler.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/TestFairScheduler.java
@@ -4512,7 +4512,7 @@
     scheduler.handle(new NodeUpdateSchedulerEvent(node2));
 
     assertEquals(4096, scheduler.getQueueManager().getQueue("queue1").
-        getResourceUsage().getMemory());
+        getResourceUsage().getMemorySize());
 
     //container will be reserved at node1
     RMContainer reservedContainer1 =
@@ -4532,7 +4532,7 @@
         app1, RMAppAttemptState.KILLED, false));
 
     assertEquals(0, scheduler.getQueueManager().getQueue("queue1").
-        getResourceUsage().getMemory());
+        getResourceUsage().getMemorySize());
 
     // container will be allocated at node2
     scheduler.handle(new NodeUpdateSchedulerEvent(node2));
