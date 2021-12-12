diff --git a/src/java/org/apache/cassandra/io/compress/LZ4Compressor.java b/src/java/org/apache/cassandra/io/compress/LZ4Compressor.java
index 3fd889e..1b3844d 100644
--- a/src/java/org/apache/cassandra/io/compress/LZ4Compressor.java
+++ b/src/java/org/apache/cassandra/io/compress/LZ4Compressor.java
@@ -207,7 +207,7 @@
         Integer level;
         try
         {
-            level = Integer.parseInt(compressionLevel);
+            level = Integer.valueOf(compressionLevel);
         }
         catch (NumberFormatException e)
         {
