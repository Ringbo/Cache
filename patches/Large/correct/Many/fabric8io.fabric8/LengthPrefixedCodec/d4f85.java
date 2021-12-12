diff --git a/fabric-dosgi/src/main/java/org/fusesource/fabric/dosgi/tcp/LengthPrefixedCodec.java b/fabric-dosgi/src/main/java/org/fusesource/fabric/dosgi/tcp/LengthPrefixedCodec.java
index bcd2f96..a5ac149 100644
--- a/fabric-dosgi/src/main/java/org/fusesource/fabric/dosgi/tcp/LengthPrefixedCodec.java
+++ b/fabric-dosgi/src/main/java/org/fusesource/fabric/dosgi/tcp/LengthPrefixedCodec.java
@@ -66,7 +66,7 @@
     public BufferState flush() throws IOException {
         if (isEmpty() && next_write_size > 0) {
             if( next_write_buffers.size()==1 ) {
-                write_buffer = next_write_buffers.get(0).toByteBuffer();
+                write_buffer = next_write_buffers.remove(0).toByteBuffer();
             } else {
                 // consolidate the buffers into 1 big buffer to reduce
                 // the number of system calls we do.
