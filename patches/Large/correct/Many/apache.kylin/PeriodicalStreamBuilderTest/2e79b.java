diff --git a/job/src/test/java/org/apache/kylin/job/streaming/PeriodicalStreamBuilderTest.java b/job/src/test/java/org/apache/kylin/job/streaming/PeriodicalStreamBuilderTest.java
index d53d419..abfc699 100644
--- a/job/src/test/java/org/apache/kylin/job/streaming/PeriodicalStreamBuilderTest.java
+++ b/job/src/test/java/org/apache/kylin/job/streaming/PeriodicalStreamBuilderTest.java
@@ -104,7 +104,7 @@
             for (BlockingQueue<StreamMessage> queue : queues) {
                 queue.put(new StreamMessage(messageCount, String.valueOf(ts).getBytes()));
             }
-            if (expectedOffset == 0 && ts > timeout) {
+            if (expectedOffset == 0 && ts >= timeout) {
                 expectedOffset = messageCount - 1;
             }
             messageCount++;
