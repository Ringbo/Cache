diff --git a/hazelcast/src/test/java/com/hazelcast/test/HazelcastParallelClassRunner.java b/hazelcast/src/test/java/com/hazelcast/test/HazelcastParallelClassRunner.java
index 4fbdf06..1010df6 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/HazelcastParallelClassRunner.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/HazelcastParallelClassRunner.java
@@ -47,7 +47,7 @@
 
     @Override
     protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {
-        while (numThreads.get() > MAX_THREADS) {
+        while (numThreads.get() >= MAX_THREADS) {
             try {
                 Thread.sleep(25);
             } catch (InterruptedException e) {
