diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/memory/HugeByteBuffer.java b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/memory/HugeByteBuffer.java
index 2c05459..afa4274 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/memory/HugeByteBuffer.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/memory/HugeByteBuffer.java
@@ -307,7 +307,7 @@
   public void putDouble(long index, double value) {
     ByteBuffer buffer = getBuffer(index);
     int bo = bufferOffset(index);
-    buffer.putDouble(bo);
+    buffer.putDouble(bo, value);
   }
 
   @Override
