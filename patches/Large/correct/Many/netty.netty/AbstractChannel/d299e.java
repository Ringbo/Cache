diff --git a/transport/src/main/java/io/netty/channel/AbstractChannel.java b/transport/src/main/java/io/netty/channel/AbstractChannel.java
index e117ed6..9bed510 100644
--- a/transport/src/main/java/io/netty/channel/AbstractChannel.java
+++ b/transport/src/main/java/io/netty/channel/AbstractChannel.java
@@ -698,7 +698,7 @@
                         promise.setFailure(t);
                     }
 
-                    if (closedChannelException != null) {
+                    if (closedChannelException == null) {
                         closedChannelException = new ClosedChannelException();
                     }
 
