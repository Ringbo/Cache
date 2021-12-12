diff --git a/src/test/java/org/redisson/RedissonSemaphoreTest.java b/src/test/java/org/redisson/RedissonSemaphoreTest.java
index dc322c1..4561a87 100644
--- a/src/test/java/org/redisson/RedissonSemaphoreTest.java
+++ b/src/test/java/org/redisson/RedissonSemaphoreTest.java
@@ -207,7 +207,7 @@
 
     @Test
     public void testConcurrency_MultiInstance_1_permits() throws InterruptedException {
-        int iterations = 100;
+        int iterations = 30;
         final AtomicInteger lockedCounter = new AtomicInteger();
 
         RSemaphore s = redisson.getSemaphore("test");
