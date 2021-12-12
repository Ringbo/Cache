diff --git a/src/main/java/org/redisson/RedissonMapCache.java b/src/main/java/org/redisson/RedissonMapCache.java
index 6d1fcce..8900fd1 100644
--- a/src/main/java/org/redisson/RedissonMapCache.java
+++ b/src/main/java/org/redisson/RedissonMapCache.java
@@ -91,7 +91,7 @@
 
     @Override
     public Future<Boolean> containsKeyAsync(Object key) {
-        return commandExecutor.evalReadAsync(getName(), codec, EVAL_CONTAINS_KEY,
+        return commandExecutor.evalWriteAsync(getName(), codec, EVAL_CONTAINS_KEY,
                 "local value = redis.call('hget', KEYS[1], ARGV[2]); " +
                 "local expireDate = 92233720368547758; " +
                 "if value ~= false then " +
@@ -122,7 +122,7 @@
 
     @Override
     public Future<Boolean> containsValueAsync(Object value) {
-        return commandExecutor.evalReadAsync(getName(), codec, EVAL_CONTAINS_VALUE,
+        return commandExecutor.evalWriteAsync(getName(), codec, EVAL_CONTAINS_VALUE,
                         "local s = redis.call('hgetall', KEYS[1]); "
                         + "for i, v in ipairs(s) do "
                             + "if i % 2 == 0 then "
@@ -166,7 +166,7 @@
         args.add(System.currentTimeMillis());
         args.addAll(keys);
 
-        return commandExecutor.evalReadAsync(getName(), codec, new RedisCommand<Map<Object, Object>>("EVAL", new MapGetAllDecoder(args), 7, ValueType.MAP_KEY, ValueType.MAP_VALUE),
+        return commandExecutor.evalWriteAsync(getName(), codec, new RedisCommand<Map<Object, Object>>("EVAL", new MapGetAllDecoder(args), 7, ValueType.MAP_KEY, ValueType.MAP_VALUE),
                         "local expireHead = redis.call('zrange', KEYS[2], 0, 0, 'withscores');" +
                         "local expireIdleHead = redis.call('zrange', KEYS[3], 0, 0, 'withscores');" +
                         "local maxDate = table.remove(ARGV, 1); " // index is the first parameter
@@ -296,7 +296,7 @@
 
     @Override
     public Future<V> getAsync(K key) {
-        return commandExecutor.evalReadAsync(getName(), codec, EVAL_GET_TTL,
+        return commandExecutor.evalWriteAsync(getName(), codec, EVAL_GET_TTL,
                    "local value = redis.call('hget', KEYS[1], ARGV[2]); "
                  + "if value == false then "
                      + "return nil; "
