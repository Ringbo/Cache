diff --git a/src/test/java/org/redisson/BaseConcurrentTest.java b/src/test/java/org/redisson/BaseConcurrentTest.java
index af05fc6..08979ad 100644
--- a/src/test/java/org/redisson/BaseConcurrentTest.java
+++ b/src/test/java/org/redisson/BaseConcurrentTest.java
@@ -11,7 +11,7 @@
 public abstract class BaseConcurrentTest extends BaseTest {
 
     protected void testMultiInstanceConcurrency(int iterations, final RedissonRunnable runnable) throws InterruptedException {
-        ExecutorService executor = Executors.newCachedThreadPool();
+        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*2);
 
         final Map<Integer, RedissonClient> instances = new HashMap<Integer, RedissonClient>();
         for (int i = 0; i < iterations; i++) {
@@ -51,7 +51,7 @@
     }
 
     protected void testSingleInstanceConcurrency(int iterations, final RedissonRunnable runnable) throws InterruptedException {
-        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
+        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*2);
 
         final RedissonClient redisson = BaseTest.createInstance();
         long watch = System.currentTimeMillis();
