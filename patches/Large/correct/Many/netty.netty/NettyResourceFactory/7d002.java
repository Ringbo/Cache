diff --git a/src/main/java/org/jboss/netty/container/spring/NettyResourceFactory.java b/src/main/java/org/jboss/netty/container/spring/NettyResourceFactory.java
index b601ba1..3441e2f 100644
--- a/src/main/java/org/jboss/netty/container/spring/NettyResourceFactory.java
+++ b/src/main/java/org/jboss/netty/container/spring/NettyResourceFactory.java
@@ -60,7 +60,7 @@
         unterminatableExecutor = null;
     }
 
-    public Executor getChannelFactoryExecutor() {
+    public synchronized Executor getChannelFactoryExecutor() {
         return unterminatableExecutor;
     }
 }
