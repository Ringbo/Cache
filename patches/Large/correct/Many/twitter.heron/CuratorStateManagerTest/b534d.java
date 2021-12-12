diff --git a/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java b/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
index 0c2e3ea..e2d4cb8 100644
--- a/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
+++ b/heron/statemgrs/tests/java/com/twitter/heron/statemgr/zookeeper/curator/CuratorStateManagerTest.java
@@ -117,7 +117,7 @@
     // Verify curator client is invoked
     verify(mockClient).start();
     verify(mockClient).blockUntilConnected(anyInt(), any(TimeUnit.class));
-    verify(mockClient, times(7)).createContainers(anyString());
+    verify(mockClient, times(8)).createContainers(anyString());
 
     // Verify initTree is called
     verify(spyStateManager).initTree();
