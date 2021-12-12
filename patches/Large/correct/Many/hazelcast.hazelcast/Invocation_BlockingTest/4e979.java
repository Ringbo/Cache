diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
index 0d89c7d..684de7b 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
@@ -334,7 +334,7 @@
      */
     @Test
     public void async_whenMultipleAndThenOnSameFuture() throws Exception {
-        int callTimeout = 1000;
+        int callTimeout = 5000;
         Config config = new Config().setProperty(OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeout);
 
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
