diff --git a/core/src/test/java/org/elasticsearch/http/netty/NettyHttpServerPipeliningTests.java b/core/src/test/java/org/elasticsearch/http/netty/NettyHttpServerPipeliningTests.java
index 53c743d..b675d29 100644
--- a/core/src/test/java/org/elasticsearch/http/netty/NettyHttpServerPipeliningTests.java
+++ b/core/src/test/java/org/elasticsearch/http/netty/NettyHttpServerPipeliningTests.java
@@ -214,7 +214,7 @@
                     Thread.sleep(timeout);
                 } catch (InterruptedException e1) {
                     Thread.currentThread().interrupt();
-                    throw new RuntimeException();
+                    throw new RuntimeException(e1);
                 }
             }
 
