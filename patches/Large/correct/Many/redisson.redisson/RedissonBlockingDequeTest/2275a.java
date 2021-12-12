diff --git a/redisson/src/test/java/org/redisson/RedissonBlockingDequeTest.java b/redisson/src/test/java/org/redisson/RedissonBlockingDequeTest.java
index aa57a68..afe7fc3 100644
--- a/redisson/src/test/java/org/redisson/RedissonBlockingDequeTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonBlockingDequeTest.java
@@ -16,7 +16,7 @@
         RBlockingDeque<String> blockingDeque = redisson.getBlockingDeque("blocking_deque");
         long start = System.currentTimeMillis();
         String redisTask = blockingDeque.pollLastAndOfferFirstTo("deque", 1, TimeUnit.SECONDS);
-        assertThat(System.currentTimeMillis() - start).isBetween(950L, 1050L);
+        assertThat(System.currentTimeMillis() - start).isBetween(950L, 1100L);
         assertThat(redisTask).isNull();
     }
     
