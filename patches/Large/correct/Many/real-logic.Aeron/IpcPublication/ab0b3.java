diff --git a/aeron-driver/src/main/java/io/aeron/driver/IpcPublication.java b/aeron-driver/src/main/java/io/aeron/driver/IpcPublication.java
index a6efd2c..c6d3ab5 100644
--- a/aeron-driver/src/main/java/io/aeron/driver/IpcPublication.java
+++ b/aeron-driver/src/main/java/io/aeron/driver/IpcPublication.java
@@ -327,7 +327,7 @@
     {
         final long consumerPosition = this.consumerPosition;
 
-        if (consumerPosition == lastConsumerPosition && isProducerPositionDifferent(consumerPosition))
+        if (consumerPosition == lastConsumerPosition && isPossiblyBlocked(consumerPosition))
         {
             if (timeNs > (timeOfLastConsumerPositionUpdateNs + unblockTimeoutNs))
             {
@@ -344,14 +344,14 @@
         }
     }
 
-    private boolean isProducerPositionDifferent(final long consumerPosition)
+    private boolean isPossiblyBlocked(final long consumerPosition)
     {
         final int producerTermCount = activeTermCount(metaDataBuffer);
         final int expectedTermCount = (int)(consumerPosition >> positionBitsToShift);
 
         if (producerTermCount != expectedTermCount)
         {
-            return false;
+            return true;
         }
 
         final long rawTail = rawTailVolatile(metaDataBuffer, indexByTermCount(producerTermCount));
