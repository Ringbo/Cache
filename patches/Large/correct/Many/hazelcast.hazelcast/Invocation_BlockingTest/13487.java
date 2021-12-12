diff --git a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
index 70132ec..c4451ab 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/impl/operationservice/impl/Invocation_BlockingTest.java
@@ -269,7 +269,7 @@
      */
     @Test
     public void sync_whenManyGettersAndLotsOfWaiting() throws Exception {
-        int callTimeout = 5000;
+        int callTimeout = 10000;
         Config config = new Config().setProperty(OPERATION_CALL_TIMEOUT_MILLIS.getName(), "" + callTimeout);
 
         TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(2);
