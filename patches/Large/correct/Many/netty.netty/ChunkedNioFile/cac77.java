diff --git a/src/main/java/org/jboss/netty/handler/stream/ChunkedNioFile.java b/src/main/java/org/jboss/netty/handler/stream/ChunkedNioFile.java
index 4235485..84a9507 100644
--- a/src/main/java/org/jboss/netty/handler/stream/ChunkedNioFile.java
+++ b/src/main/java/org/jboss/netty/handler/stream/ChunkedNioFile.java
@@ -136,7 +136,7 @@
     }
 
     public boolean isEndOfInput() throws Exception {
-        return hasNextChunk();
+        return !hasNextChunk();
     }
 
     public void close() throws Exception {
