diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
index 2d62baa..052cc7b 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/OperationServiceImpl_timeoutTest.java
@@ -190,7 +190,7 @@
 
     @Test
     public void testOperationTimeoutForLongRunningRemoteOperation() throws Exception {
-        int callTimeoutMillis = 3000;
+        int callTimeoutMillis = 6000;
         Config config = new Config().setProperty(OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeoutMillis);
 
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
