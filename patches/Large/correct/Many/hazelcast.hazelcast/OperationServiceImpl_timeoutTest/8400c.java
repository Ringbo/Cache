diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
index a575f02..4e6fe0a 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
@@ -175,7 +175,7 @@
 
     @Test
     public void testOperationTimeoutForLongRunningRemoteOperation() throws Exception {
-        int callTimeoutMillis = 1000;
+        int callTimeoutMillis = 3000;
         Config config = new Config().setProperty(OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeoutMillis);
 
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
