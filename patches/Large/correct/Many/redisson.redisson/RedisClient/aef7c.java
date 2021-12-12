diff --git a/redisson/src/main/java/org/redisson/client/RedisClient.java b/redisson/src/main/java/org/redisson/client/RedisClient.java
index 858351e..1728f11 100644
--- a/redisson/src/main/java/org/redisson/client/RedisClient.java
+++ b/redisson/src/main/java/org/redisson/client/RedisClient.java
@@ -317,7 +317,7 @@
         }
         ChannelGroupFuture channelsFuture = channels.close();
         
-        RPromise<Void> result = new RedissonPromise<Void>();
+        final RPromise<Void> result = new RedissonPromise<Void>();
         channelsFuture.addListener(new FutureListener<Void>() {
             @Override
             public void operationComplete(Future<Void> future) throws Exception {
