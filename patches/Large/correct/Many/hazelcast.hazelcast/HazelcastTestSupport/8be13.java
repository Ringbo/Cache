diff --git a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
index 14b27bc..d5df99d 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
@@ -776,16 +776,16 @@
 
     public static void assertJoinable(long timeoutSeconds, Thread... threads) {
         try {
-            long remainingTimeout = TimeUnit.SECONDS.toNanos(timeoutSeconds);
+            long remainingTimeout = TimeUnit.SECONDS.toMillis(timeoutSeconds);
             for (Thread thread : threads) {
-                long start = System.nanoTime();
+                long start = System.currentTimeMillis();
                 thread.join(remainingTimeout);
 
                 if (thread.isAlive()) {
                     fail("Timeout waiting for thread " + thread.getName() + " to terminate");
                 }
 
-                long duration = System.nanoTime() - start;
+                long duration = System.currentTimeMillis() - start;
                 remainingTimeout -= duration;
                 if (remainingTimeout <= 0) {
                     fail("Timeout waiting for thread " + thread.getName() + " to terminate");
