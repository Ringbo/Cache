diff --git a/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/OrcEncodedDataProducer.java b/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/OrcEncodedDataProducer.java
index f450302..93f4257 100644
--- a/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/OrcEncodedDataProducer.java
+++ b/llap-server/src/java/org/apache/hadoop/hive/llap/io/encoded/OrcEncodedDataProducer.java
@@ -126,7 +126,7 @@
         metadata = getOrReadFileMetadata();
         int bufferSize = metadata.getCompressionBufferSize();
         int minAllocSize = HiveConf.getIntVar(conf, HiveConf.ConfVars.LLAP_ORC_CACHE_MIN_ALLOC);
-        if (bufferSize != minAllocSize) {
+        if (bufferSize < minAllocSize) {
           throw new IOException("ORC compression buffer size (" + bufferSize + ") is smaller than" +
               " LLAP low-level cache minimum allocation size (" + minAllocSize + "). Decrease the" +
               " value for " + HiveConf.ConfVars.LLAP_ORC_CACHE_MIN_ALLOC.toString());
