diff --git a/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java b/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
index c90252f..0c924a5 100644
--- a/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
+++ b/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
@@ -295,10 +295,10 @@
 
                 cancelledKeys = 0;
 
-                runAllTasks();
+                processSelectedKeys();
                 selector = this.selector;
 
-                processSelectedKeys();
+                runAllTasks();
                 selector = this.selector;
 
                 if (isShutdown()) {
@@ -502,7 +502,7 @@
 
     @Override
     protected void wakeup(boolean inEventLoop) {
-        if (wakenUp.compareAndSet(false, true)) {
+        if (!inEventLoop && wakenUp.compareAndSet(false, true)) {
             selector.wakeup();
         }
     }
