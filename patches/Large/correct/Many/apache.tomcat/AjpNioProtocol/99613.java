diff --git a/java/org/apache/coyote/ajp/AjpNioProtocol.java b/java/org/apache/coyote/ajp/AjpNioProtocol.java
index 51d4988..6052497 100644
--- a/java/org/apache/coyote/ajp/AjpNioProtocol.java
+++ b/java/org/apache/coyote/ajp/AjpNioProtocol.java
@@ -190,7 +190,7 @@
                         state = processor.process(socket);
                     }
 
-                    if (state == SocketState.CLOSED && processor.isAsync()) {
+                    if (state != SocketState.CLOSED && processor.isAsync()) {
                         state = processor.asyncPostProcess();
                     }
                 } while (state == SocketState.ASYNC_END);
