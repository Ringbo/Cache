diff --git a/src/main/java/org/jboss/netty/handler/stream/ChunkedFile.java b/src/main/java/org/jboss/netty/handler/stream/ChunkedFile.java
index de3598d..ba8d605 100644
--- a/src/main/java/org/jboss/netty/handler/stream/ChunkedFile.java
+++ b/src/main/java/org/jboss/netty/handler/stream/ChunkedFile.java
@@ -130,7 +130,7 @@
     }
 
     public boolean isEndOfInput() throws Exception {
-        return hasNextChunk();
+        return !hasNextChunk();
     }
 
     public void close() throws Exception {
