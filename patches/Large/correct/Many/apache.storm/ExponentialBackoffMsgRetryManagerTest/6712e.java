diff --git a/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java b/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
index a30887c..da23718 100644
--- a/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
+++ b/external/storm-kafka/src/test/storm/kafka/ExponentialBackoffMsgRetryManagerTest.java
@@ -50,14 +50,14 @@
 
     @Test
     public void testSingleDelay() throws Exception {
-        ExponentialBackoffMsgRetryManager manager = new ExponentialBackoffMsgRetryManager(10, 1d, 100);
+        ExponentialBackoffMsgRetryManager manager = new ExponentialBackoffMsgRetryManager(100, 1d, 1000);
         manager.failed(TEST_OFFSET);
         Thread.sleep(5);
         Long next = manager.nextFailedMessageToRetry();
         assertNull("expect no message ready for retry yet", next);
         assertFalse("message should not be ready for retry yet", manager.shouldRetryMsg(TEST_OFFSET));
 
-        Thread.sleep(10);
+        Thread.sleep(100);
         next = manager.nextFailedMessageToRetry();
         assertEquals("expect test offset next available for retry", TEST_OFFSET, next);
         assertTrue("message should be ready for retry", manager.shouldRetryMsg(TEST_OFFSET));
