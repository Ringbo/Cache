diff --git a/transport/src/main/java/io/netty/channel/nio/AbstractNioChannel.java b/transport/src/main/java/io/netty/channel/nio/AbstractNioChannel.java
index a5547f4..fd17e88 100644
--- a/transport/src/main/java/io/netty/channel/nio/AbstractNioChannel.java
+++ b/transport/src/main/java/io/netty/channel/nio/AbstractNioChannel.java
@@ -237,7 +237,8 @@
                     t = newT;
                 }
 
-                connectPromise.setFailure(t);
+                // Use tryFailure() instead of setFailure() to avoid the race against cancel().
+                connectPromise.tryFailure(t);
                 closeIfClosed();
             } finally {
                 // Check for null as the connectTimeoutFuture is only created if a connectTimeoutMillis > 0 is used
