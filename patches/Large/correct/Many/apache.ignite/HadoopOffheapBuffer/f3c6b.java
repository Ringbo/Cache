diff --git a/modules/hadoop/src/main/java/org/apache/ignite/internal/processors/hadoop/shuffle/streams/HadoopOffheapBuffer.java b/modules/hadoop/src/main/java/org/apache/ignite/internal/processors/hadoop/shuffle/streams/HadoopOffheapBuffer.java
index d15e7eb..ed6feae 100644
--- a/modules/hadoop/src/main/java/org/apache/ignite/internal/processors/hadoop/shuffle/streams/HadoopOffheapBuffer.java
+++ b/modules/hadoop/src/main/java/org/apache/ignite/internal/processors/hadoop/shuffle/streams/HadoopOffheapBuffer.java
@@ -92,7 +92,7 @@
      * @return Old position pointer or {@code 0} if move goes beyond the end of the buffer.
      */
     public long move(long size) {
-        assert size > 0 : size;
+        assert size >= 0 : size;
 
         long oldPos = posPtr;
         long newPos = oldPos + size;
