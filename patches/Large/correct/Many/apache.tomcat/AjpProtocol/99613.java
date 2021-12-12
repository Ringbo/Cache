diff --git a/java/org/apache/coyote/ajp/AjpProtocol.java b/java/org/apache/coyote/ajp/AjpProtocol.java
index 2898957..29517b6 100644
--- a/java/org/apache/coyote/ajp/AjpProtocol.java
+++ b/java/org/apache/coyote/ajp/AjpProtocol.java
@@ -143,7 +143,7 @@
                         state = processor.process(socket);
                     }
     
-                    if (state == SocketState.CLOSED && processor.isAsync()) {
+                    if (state != SocketState.CLOSED && processor.isAsync()) {
                         state = processor.asyncPostProcess();
                     }
                 } while (state == SocketState.ASYNC_END);
