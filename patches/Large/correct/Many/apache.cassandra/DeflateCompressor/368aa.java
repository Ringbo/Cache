diff --git a/src/java/org/apache/cassandra/io/compress/DeflateCompressor.java b/src/java/org/apache/cassandra/io/compress/DeflateCompressor.java
index 1894f11..ba5e83a 100644
--- a/src/java/org/apache/cassandra/io/compress/DeflateCompressor.java
+++ b/src/java/org/apache/cassandra/io/compress/DeflateCompressor.java
@@ -76,7 +76,7 @@
         while (true)
         {
             offs += def.deflate(output.buffer, offs, output.buffer.length - offs);
-            if (def.needsInput())
+            if (def.finished())
             {
                 return offs - outputOffset;
             }
