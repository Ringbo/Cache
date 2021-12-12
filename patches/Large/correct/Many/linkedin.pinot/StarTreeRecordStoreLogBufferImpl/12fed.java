diff --git a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeRecordStoreLogBufferImpl.java b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeRecordStoreLogBufferImpl.java
index 54c993f..9f37636 100644
--- a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeRecordStoreLogBufferImpl.java
+++ b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeRecordStoreLogBufferImpl.java
@@ -389,14 +389,14 @@
         int newCapacity = expandedBuffer.capacity();
         buffer = expandedBuffer;
 
-        if (LOG.isDebugEnabled())
+        if (LOGGER.isDebugEnabled())
         {
           LOGGER.debug("Expanded buffer ({}): oldCapacity={},newCapacity={}", nodeId, oldCapacity, newCapacity);
         }
       }
       else
       {
-        if (LOG.isDebugEnabled())
+        if (LOGGER.isDebugEnabled())
         {
           LOGGER.debug("Compacted buffer ({}): loadFactor={},capacity={}", nodeId, loadFactor, buffer.capacity());
         }
