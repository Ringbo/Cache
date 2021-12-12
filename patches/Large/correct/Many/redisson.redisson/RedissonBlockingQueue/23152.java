diff --git a/src/main/java/org/redisson/RedissonBlockingQueue.java b/src/main/java/org/redisson/RedissonBlockingQueue.java
index b2318b8..7399fb2 100644
--- a/src/main/java/org/redisson/RedissonBlockingQueue.java
+++ b/src/main/java/org/redisson/RedissonBlockingQueue.java
@@ -65,7 +65,7 @@
 
     @Override
     public V poll(final long timeout, final TimeUnit unit) throws InterruptedException {
-        return connectionManager.read(getName(), new SyncOperation<V, V>() {
+        return connectionManager.write(getName(), new SyncOperation<V, V>() {
             @Override
             public V execute(RedisConnection<Object, V> conn) {
                 return conn.blpop(unit.toSeconds(timeout), getName()).value;
