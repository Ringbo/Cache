diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/data/manager/realtime/LLRealtimeSegmentDataManager.java b/pinot-core/src/main/java/com/linkedin/pinot/core/data/manager/realtime/LLRealtimeSegmentDataManager.java
index 0f1e76a..63b4807 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/data/manager/realtime/LLRealtimeSegmentDataManager.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/data/manager/realtime/LLRealtimeSegmentDataManager.java
@@ -498,7 +498,7 @@
 
   public void start() {
     _state = State.INITIAL_CONSUMING;
-    _consumerThread = new Thread(_segmentNameStr);
+    _consumerThread = new Thread(new PartitionConsumer(), _segmentNameStr);
     segmentLogger.info("Created new consumer thread {} for {}", _consumerThread, this.toString());
     _consumerThread.start();
   }
