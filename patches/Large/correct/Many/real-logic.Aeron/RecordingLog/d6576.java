diff --git a/aeron-cluster/src/main/java/io/aeron/cluster/service/RecordingLog.java b/aeron-cluster/src/main/java/io/aeron/cluster/service/RecordingLog.java
index 7091cb2..dd79c6e 100644
--- a/aeron-cluster/src/main/java/io/aeron/cluster/service/RecordingLog.java
+++ b/aeron-cluster/src/main/java/io/aeron/cluster/service/RecordingLog.java
@@ -235,14 +235,14 @@
             this.termSteps = termSteps;
         }
 
-        public RecoveryPlan(final ByteBuffer byteBuffer)
+        public RecoveryPlan(final byte[] bytes)
         {
-            this(byteBuffer.array());
+            this(ByteBuffer.wrap(bytes));
         }
 
-        public RecoveryPlan(final byte[] decodingBuffer)
+        public RecoveryPlan(final ByteBuffer byteBuffer)
         {
-            unsafeBuffer.wrap(decodingBuffer);
+            unsafeBuffer.wrap(byteBuffer);
             decoder.wrap(unsafeBuffer, 0, RecoveryPlanDecoder.BLOCK_LENGTH, RecoveryPlanDecoder.SCHEMA_VERSION);
 
             this.lastLeadershipTermId = decoder.lastLeadershipTermId();
