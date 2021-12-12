diff --git a/redisson/src/main/java/org/redisson/RedissonTopic.java b/redisson/src/main/java/org/redisson/RedissonTopic.java
index c61eeba..6206bfc 100644
--- a/redisson/src/main/java/org/redisson/RedissonTopic.java
+++ b/redisson/src/main/java/org/redisson/RedissonTopic.java
@@ -108,7 +108,7 @@
     
     public RFuture<Integer> addListenerAsync(final RedisPubSubListener<?> pubSubListener) {
         RFuture<PubSubConnectionEntry> future = commandExecutor.getConnectionManager().subscribe(codec, name, pubSubListener);
-        RPromise<Integer> result = new RedissonPromise<Integer>();
+        final RPromise<Integer> result = new RedissonPromise<Integer>();
         future.addListener(new FutureListener<PubSubConnectionEntry>() {
             @Override
             public void operationComplete(Future<PubSubConnectionEntry> future) throws Exception {
