diff --git a/src/main/java/org/jboss/netty/container/microcontainer/NettyResourceFactory.java b/src/main/java/org/jboss/netty/container/microcontainer/NettyResourceFactory.java
index 1010455..5b99fe3 100644
--- a/src/main/java/org/jboss/netty/container/microcontainer/NettyResourceFactory.java
+++ b/src/main/java/org/jboss/netty/container/microcontainer/NettyResourceFactory.java
@@ -63,7 +63,7 @@
         unterminatableExecutor = null;
     }
 
-    public Executor getChannelFactoryExecutor() {
+    public synchronized Executor getChannelFactoryExecutor() {
         return unterminatableExecutor;
     }
 }
