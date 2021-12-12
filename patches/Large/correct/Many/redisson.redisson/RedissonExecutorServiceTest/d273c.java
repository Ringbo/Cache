diff --git a/redisson/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java b/redisson/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
index 2d2340f..514662d 100644
--- a/redisson/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
+++ b/redisson/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
@@ -130,12 +130,12 @@
         RExecutorFuture<?> future = executor.submit(new ScheduledLongRunnableTask("executed1"));
         Thread.sleep(2000);
         cancel(future);
-        assertThat(redisson.<Integer>getBucket("executed1").get()).isBetween(1000, Integer.MAX_VALUE);
+        assertThat(redisson.<Long>getBucket("executed1").get()).isBetween(1000L, Long.MAX_VALUE);
         
         RExecutorFuture<?> futureAsync = executor.submitAsync(new ScheduledLongRunnableTask("executed2"));
         Thread.sleep(2000);
         assertThat(executor.cancelTask(futureAsync.getTaskId())).isTrue();
-        assertThat(redisson.<Integer>getBucket("executed2").get()).isBetween(1000, Integer.MAX_VALUE);
+        assertThat(redisson.<Long>getBucket("executed2").get()).isBetween(1000L, Long.MAX_VALUE);
     }
     
     @Test
