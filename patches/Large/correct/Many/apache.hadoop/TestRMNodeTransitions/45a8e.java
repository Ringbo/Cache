diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMNodeTransitions.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMNodeTransitions.java
index 2b2decc..f9ba80c 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMNodeTransitions.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMNodeTransitions.java
@@ -200,7 +200,7 @@
   private RMNodeImpl getRunningNode() {
     NodeId nodeId = BuilderUtils.newNodeId("localhost", 0);
     RMNodeImpl node = new RMNodeImpl(nodeId, rmContext,null, 0, 0,
-        null, null, null);
+        null, null);
     node.handle(new RMNodeEvent(node.getNodeID(), RMNodeEventType.STARTED));
     Assert.assertEquals(NodeState.RUNNING, node.getState());
     return node;
@@ -212,7 +212,7 @@
     status.setHealthReport("sick");
     status.setIsNodeHealthy(false);
     node.handle(new RMNodeStatusEvent(node.getNodeID(), status,
-        new ArrayList<ContainerStatus>(), null, null, null));
+        new ArrayList<ContainerStatus>(), null, null));
     Assert.assertEquals(NodeState.UNHEALTHY, node.getState());
     return node;
   }
