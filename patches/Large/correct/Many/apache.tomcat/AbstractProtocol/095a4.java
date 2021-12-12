diff --git a/java/org/apache/coyote/AbstractProtocol.java b/java/org/apache/coyote/AbstractProtocol.java
index 6aa560d..991a9f5 100644
--- a/java/org/apache/coyote/AbstractProtocol.java
+++ b/java/org/apache/coyote/AbstractProtocol.java
@@ -604,9 +604,13 @@
 
                 SocketState state = SocketState.CLOSED;
                 do {
-                    if (status == SocketStatus.DISCONNECT) {
-                        //do nothing here, just wait for it to get recycled
-                    } else if (processor.isAsync() || state == SocketState.ASYNC_END) {
+                    if (status == SocketStatus.DISCONNECT &&
+                            !processor.isComet()) {
+                        // Do nothing here, just wait for it to get recycled
+                        // Don't do this for Comet we need to generate an end
+                        // event (see BZ 54022)
+                    } else if (processor.isAsync() ||
+                            state == SocketState.ASYNC_END) {
                         state = processor.asyncDispatch(status);
                     } else if (processor.isComet()) {
                         state = processor.event(status);
