diff --git a/redisson/src/test/java/org/redisson/RedissonBatchTest.java b/redisson/src/test/java/org/redisson/RedissonBatchTest.java
index 348aed5..6571c45 100644
--- a/redisson/src/test/java/org/redisson/RedissonBatchTest.java
+++ b/redisson/src/test/java/org/redisson/RedissonBatchTest.java
@@ -150,7 +150,7 @@
         
         BatchOptions batchOptions = BatchOptions.defaults().executionMode(ExecutionMode.REDIS_WRITE_ATOMIC);
         RBatch batch = redisson.createBatch(batchOptions);
-        for (int i = 0; i < 200000; i++) {
+        for (int i = 0; i < 300000; i++) {
             batch.getBucket("test").setAsync(123);
         }
         
