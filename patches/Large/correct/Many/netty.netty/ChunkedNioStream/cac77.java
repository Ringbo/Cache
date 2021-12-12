diff --git a/src/main/java/org/jboss/netty/handler/stream/ChunkedNioStream.java b/src/main/java/org/jboss/netty/handler/stream/ChunkedNioStream.java
index 5183b6d..b30ec47 100644
--- a/src/main/java/org/jboss/netty/handler/stream/ChunkedNioStream.java
+++ b/src/main/java/org/jboss/netty/handler/stream/ChunkedNioStream.java
@@ -97,7 +97,7 @@
     }
 
     public boolean isEndOfInput() throws Exception {
-        return hasNextChunk();
+        return !hasNextChunk();
     }
 
     public void close() throws Exception {
