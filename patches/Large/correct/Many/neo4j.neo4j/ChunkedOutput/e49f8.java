diff --git a/community/bolt/src/main/java/org/neo4j/bolt/v1/transport/ChunkedOutput.java b/community/bolt/src/main/java/org/neo4j/bolt/v1/transport/ChunkedOutput.java
index 62df8a7..164f2b4 100644
--- a/community/bolt/src/main/java/org/neo4j/bolt/v1/transport/ChunkedOutput.java
+++ b/community/bolt/src/main/java/org/neo4j/bolt/v1/transport/ChunkedOutput.java
@@ -58,8 +58,10 @@
         this.buffer = channel.alloc().buffer( this.bufferSize, this.bufferSize );
     }
 
+    //Flush can be called from a separate thread, we therefor need to synchronize
+    //on everything that touches the buffer
     @Override
-    public PackOutput flush() throws IOException
+    public synchronized PackOutput flush() throws IOException
     {
         if ( buffer != null && buffer.readableBytes() > 0 )
         {
@@ -186,7 +188,7 @@
         chunkOpen = false;
     }
 
-    public void close()
+    public synchronized void close()
     {
         if(buffer != null)
         {
