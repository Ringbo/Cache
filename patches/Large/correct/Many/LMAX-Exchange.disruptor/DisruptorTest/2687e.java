diff --git a/src/test/java/com/lmax/disruptor/dsl/DisruptorTest.java b/src/test/java/com/lmax/disruptor/dsl/DisruptorTest.java
index 42511fa..b476135 100644
--- a/src/test/java/com/lmax/disruptor/dsl/DisruptorTest.java
+++ b/src/test/java/com/lmax/disruptor/dsl/DisruptorTest.java
@@ -96,7 +96,7 @@
     @Test
     public void shouldProcessMessagesPublishedBeforeStartIsCalled() throws Exception
     {
-        final CountDownLatch eventCounter = new CountDownLatch(0);
+        final CountDownLatch eventCounter = new CountDownLatch(2);
         disruptor.handleEventsWith(new EventHandler<TestEvent>()
         {
             @Override
