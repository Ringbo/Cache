diff --git a/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java b/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
index 34e3597..c8900df 100644
--- a/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
+++ b/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
@@ -107,7 +107,7 @@
     // Verify curator client is invoked
     Mockito.verify(mockClient).start();
     Mockito.verify(mockClient).blockUntilConnected(Mockito.anyInt(), Mockito.any(TimeUnit.class));
-    Mockito.verify(mockClient, Mockito.times(5)).createContainers(Mockito.anyString());
+    Mockito.verify(mockClient, Mockito.times(6)).createContainers(Mockito.anyString());
 
     // Verify initTree is called
     Mockito.verify(spyStateManager).initTree();
