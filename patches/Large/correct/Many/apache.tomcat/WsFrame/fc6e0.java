diff --git a/java/org/apache/catalina/websocket/WsFrame.java b/java/org/apache/catalina/websocket/WsFrame.java
index d3abbd9..56e7d3a 100644
--- a/java/org/apache/catalina/websocket/WsFrame.java
+++ b/java/org/apache/catalina/websocket/WsFrame.java
@@ -215,8 +215,8 @@
         } else if (read == 0) {
             return null;
         } else {
-            // TODO message
-            throw new IOException();
+            throw new IOException(
+                    sm.getString("frame.readFailed", Integer.valueOf(read)));
         }
     }
 }
