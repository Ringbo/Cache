diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterSynchronizedProcessingTime.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterSynchronizedProcessingTime.java
index a811a9b..0a274c9 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterSynchronizedProcessingTime.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/transforms/windowing/AfterSynchronizedProcessingTime.java
@@ -32,8 +32,7 @@
   @Override
   @Nullable
   public Instant getCurrentTime(Trigger<W>.TriggerContext context) {
-    // TODO: plumb synchronized processing time
-    return context.currentProcessingTime();
+    return context.currentSynchronizedProcessingTime();
   }
 
   public AfterSynchronizedProcessingTime() {
