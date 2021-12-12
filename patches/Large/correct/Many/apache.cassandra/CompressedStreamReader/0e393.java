diff --git a/src/java/org/apache/cassandra/streaming/compress/CompressedStreamReader.java b/src/java/org/apache/cassandra/streaming/compress/CompressedStreamReader.java
index d843351..ebd191b 100644
--- a/src/java/org/apache/cassandra/streaming/compress/CompressedStreamReader.java
+++ b/src/java/org/apache/cassandra/streaming/compress/CompressedStreamReader.java
@@ -61,7 +61,7 @@
     @Override
     public SSTableWriter read(ReadableByteChannel channel) throws IOException
     {
-        logger.info("reading file from {}, repairedAt = {}", session.peer, repairedAt);
+        logger.debug("reading file from {}, repairedAt = {}", session.peer, repairedAt);
         long totalSize = totalSize();
 
         Pair<String, String> kscf = Schema.instance.getCF(cfId);
