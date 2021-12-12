diff --git a/src/main/java/org/redisson/RedissonExpirable.java b/src/main/java/org/redisson/RedissonExpirable.java
index 07a7efc..9bebf50 100644
--- a/src/main/java/org/redisson/RedissonExpirable.java
+++ b/src/main/java/org/redisson/RedissonExpirable.java
@@ -43,7 +43,7 @@
 
     @Override
     public Future<Boolean> expireAsync(long timeToLive, TimeUnit timeUnit) {
-        return commandExecutor.writeAsync(getName(), StringCodec.INSTANCE, RedisCommands.PEXPIRE, getName(), timeUnit.toSeconds(timeToLive));
+        return commandExecutor.writeAsync(getName(), StringCodec.INSTANCE, RedisCommands.PEXPIRE, getName(), timeUnit.toMillis(timeToLive));
     }
 
     @Override
