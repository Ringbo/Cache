diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/SocketAddressResolver.java b/jetty-util/src/main/java/org/eclipse/jetty/util/SocketAddressResolver.java
index fe7eead..fd43efa 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/SocketAddressResolver.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/SocketAddressResolver.java
@@ -155,7 +155,7 @@
                     {
                         if (complete.compareAndSet(false, true))
                         {
-                            promise.failed(new TimeoutException());
+                            promise.failed(new TimeoutException("DNS timeout " + getTimeout() + " ms"));
                             thread.interrupt();
                         }
                     }, timeout, TimeUnit.MILLISECONDS);
