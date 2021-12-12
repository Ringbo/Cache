diff --git a/src/java/org/apache/cassandra/streaming/StreamReader.java b/src/java/org/apache/cassandra/streaming/StreamReader.java
index 7963629..f47479f 100644
--- a/src/java/org/apache/cassandra/streaming/StreamReader.java
+++ b/src/java/org/apache/cassandra/streaming/StreamReader.java
@@ -79,7 +79,7 @@
      */
     public SSTableWriter read(ReadableByteChannel channel) throws IOException
     {
-        logger.info("reading file from {}, repairedAt = {}", session.peer, repairedAt);
+        logger.debug("reading file from {}, repairedAt = {}", session.peer, repairedAt);
         long totalSize = totalSize();
 
         Pair<String, String> kscf = Schema.instance.getCF(cfId);
