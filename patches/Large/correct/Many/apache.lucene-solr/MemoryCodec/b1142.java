diff --git a/lucene/src/java/org/apache/lucene/index/codecs/memory/MemoryCodec.java b/lucene/src/java/org/apache/lucene/index/codecs/memory/MemoryCodec.java
index b4fed2d..dbe6265 100644
--- a/lucene/src/java/org/apache/lucene/index/codecs/memory/MemoryCodec.java
+++ b/lucene/src/java/org/apache/lucene/index/codecs/memory/MemoryCodec.java
@@ -691,7 +691,7 @@
       final int fieldNumber = in.readVInt();
       field = fieldInfos.fieldInfo(fieldNumber);
       if (!field.omitTermFreqAndPositions) {
-        sumTotalTermFreq = in.readVInt();
+        sumTotalTermFreq = in.readVLong();
       } else {
         sumTotalTermFreq = 0;
       }
