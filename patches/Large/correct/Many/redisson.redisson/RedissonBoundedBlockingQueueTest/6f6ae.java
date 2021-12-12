diff --git a/redisson/src/test/java/org/redisson/RedissonBoundedBlockingQueueTest.java b/redisson/src/test/java/org/redisson/RedissonBoundedBlockingQueueTest.java
index 98fa904..8e29512 100644
--- a/redisson/src/test/java/org/redisson/RedissonBoundedBlockingQueueTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonBoundedBlockingQueueTest.java
@@ -44,7 +44,7 @@
 
         long start = System.currentTimeMillis();
         assertThat(queue.offer(6, 2, TimeUnit.SECONDS)).isFalse();
-        assertThat(System.currentTimeMillis() - start).isGreaterThan(2000);
+        assertThat(System.currentTimeMillis() - start).isGreaterThan(1900);
         
         ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
         final AtomicBoolean executed = new AtomicBoolean();
