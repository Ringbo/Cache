diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
index ec934b8..605fc1b 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
@@ -368,7 +368,7 @@
                     LOG.debug("unconsumed input {}", this);
                 // Complete reading the request
                 if (!_channel.getRequest().getHttpInput().consumeAll())
-                    _channel.abort();
+                    _channel.abort(new IOException("unconsumed input"));
             }
         }
 
