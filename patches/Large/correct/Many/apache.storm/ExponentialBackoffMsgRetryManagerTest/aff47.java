diff --git a/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java b/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
index 11ad5b7..a30887c 100644
--- a/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
+++ b/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
@@ -163,9 +163,9 @@
 
     @Test
     public void testMaxBackoff() throws Exception {
-        final long initial = 10;
+        final long initial = 100;
         final double mult = 2d;
-        final long max = 20;
+        final long max = 2000;
         ExponentialBackoffMsgRetryManager manager = new ExponentialBackoffMsgRetryManager(initial, mult, max);
 
         long expectedWaitTime = initial;
