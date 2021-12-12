diff --git a/src/main/java/org/jboss/netty/handler/stream/ChunkedStream.java b/src/main/java/org/jboss/netty/handler/stream/ChunkedStream.java
index fb7a3c3..6946911 100644
--- a/src/main/java/org/jboss/netty/handler/stream/ChunkedStream.java
+++ b/src/main/java/org/jboss/netty/handler/stream/ChunkedStream.java
@@ -85,7 +85,7 @@
     }
 
     public boolean isEndOfInput() throws Exception {
-        return hasNextChunk();
+        return !hasNextChunk();
     }
 
     public void close() throws Exception {
