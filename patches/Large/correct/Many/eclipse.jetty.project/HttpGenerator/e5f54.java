diff --git a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpGenerator.java b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpGenerator.java
index 1fcef6d..f480ab2 100644
--- a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpGenerator.java
+++ b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpGenerator.java
@@ -171,7 +171,7 @@
                 Buffer nc=_buffers.getBuffer(_content.length()+content.length());
                 nc.put(_content);
                 nc.put(content);
-                _content=nc;
+                content=nc;
             }
         }
 
