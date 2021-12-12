diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedRawLog.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedRawLog.java
index 02726ba..a6b4b11 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedRawLog.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedRawLog.java
@@ -132,7 +132,7 @@
         {
             final int index = i + PARTITION_COUNT;
             buffersReadyFlyweight.bufferOffset(index, metaDataSectionOffset + (i * TERM_META_DATA_LENGTH));
-            buffersReadyFlyweight.bufferLength(index, termLength);
+            buffersReadyFlyweight.bufferLength(index, TERM_META_DATA_LENGTH);
             buffersReadyFlyweight.bufferLocation(index, absoluteFilePath);
         }
 
