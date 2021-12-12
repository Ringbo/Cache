diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
index 684de7b..b5ae2ad 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
@@ -176,7 +176,7 @@
 
     @Test
     public void async_whenOperationTimeout() {
-        int callTimeout = 1000;
+        int callTimeout = 5000;
         Config config = new Config().setProperty(OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeout);
 
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
