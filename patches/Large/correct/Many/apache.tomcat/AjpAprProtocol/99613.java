diff --git a/java/org/apache/coyote/ajp/AjpAprProtocol.java b/java/org/apache/coyote/ajp/AjpAprProtocol.java
index ccb3e96..83a6b25 100644
--- a/java/org/apache/coyote/ajp/AjpAprProtocol.java
+++ b/java/org/apache/coyote/ajp/AjpAprProtocol.java
@@ -152,7 +152,7 @@
                         state = processor.process(socket);
                     }
 
-                    if (state == SocketState.CLOSED && processor.isAsync()) {
+                    if (state != SocketState.CLOSED && processor.isAsync()) {
                         state = processor.asyncPostProcess();
                     }
                 } while (state == SocketState.ASYNC_END);
