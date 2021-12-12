diff --git a/src/main/java/org/redisson/RedissonMapCache.java b/src/main/java/org/redisson/RedissonMapCache.java
index 5cb409e..5b5509f 100644
--- a/src/main/java/org/redisson/RedissonMapCache.java
+++ b/src/main/java/org/redisson/RedissonMapCache.java
@@ -703,7 +703,7 @@
 
     @Override
     public Future<Boolean> deleteAsync() {
-        return commandExecutor.writeAsync(getName(), RedisCommands.DEL_OBJECTS, getName(), getTimeoutSetName());
+        return commandExecutor.writeAsync(getName(), RedisCommands.DEL_OBJECTS, getName(), getTimeoutSetName(), getIdleSetName());
     }
 
     @Override
