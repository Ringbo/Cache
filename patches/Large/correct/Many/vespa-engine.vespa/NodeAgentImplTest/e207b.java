diff --git a/node-admin/src/test/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImplTest.java b/node-admin/src/test/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImplTest.java
index d9255da..e8a24fd 100644
--- a/node-admin/src/test/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImplTest.java
+++ b/node-admin/src/test/java/com/yahoo/vespa/hosted/node/admin/nodeagent/NodeAgentImplTest.java
@@ -278,7 +278,7 @@
         flagSource.withDoubleFlag(Flags.CONTAINER_CPU_CAP.id(), 2.3);
 
         nodeAgent.converge(thirdContext);
-        inOrder.verify(dockerOperations).updateContainer(eq(thirdContext), eq(ContainerResources.from(2.3, 4, 16)));
+        inOrder.verify(dockerOperations).updateContainer(eq(thirdContext), eq(ContainerResources.from(9.2, 4, 16)));
         inOrder.verify(orchestrator).resume(any(String.class));
     }
 
