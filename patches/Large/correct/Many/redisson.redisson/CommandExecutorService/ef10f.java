diff --git a/src/main/java/org/redisson/CommandExecutorService.java b/src/main/java/org/redisson/CommandExecutorService.java
index 04c496d..d81440d 100644
--- a/src/main/java/org/redisson/CommandExecutorService.java
+++ b/src/main/java/org/redisson/CommandExecutorService.java
@@ -438,7 +438,7 @@
             }
         };
 
-        ex.set(new RedisTimeoutException());
+        ex.set(new RedisTimeoutException("Command execution timeout for " + command + " with params " + Arrays.toString(params)));
         final Timeout timeout = connectionManager.getTimer().newTimeout(retryTimerTask, connectionManager.getConfig().getTimeout(), TimeUnit.MILLISECONDS);
 
         final Future<RedisConnection> connectionFuture;
