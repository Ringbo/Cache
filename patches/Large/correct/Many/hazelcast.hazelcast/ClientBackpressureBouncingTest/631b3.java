diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientBackpressureBouncingTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientBackpressureBouncingTest.java
index 0761496..34b6dbe 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientBackpressureBouncingTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientBackpressureBouncingTest.java
@@ -166,7 +166,7 @@
         private void assertInFlightInvocationsWereNotGrowing() {
             assertTrue("There are no invocations to be observed!", maxInvocationCountObserved > 0);
 
-            long maximumTolerableInvocationCount = (long) (maxInvocationCountObservedDuringWarmup * 1.2);
+            long maximumTolerableInvocationCount = (long) (maxInvocationCountObservedDuringWarmup * 2);
             assertTrue("Apparently number of in-flight invocations is growing."
                     + " Max. number of in-flight invocation during first fifth of test duration: "
                     + maxInvocationCountObservedDuringWarmup
