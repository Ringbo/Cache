diff --git a/src/main/java/org/redisson/RedissonSet.java b/src/main/java/org/redisson/RedissonSet.java
index c0db7de..fc149db 100644
--- a/src/main/java/org/redisson/RedissonSet.java
+++ b/src/main/java/org/redisson/RedissonSet.java
@@ -229,7 +229,7 @@
         args.add(getName());
         args.addAll(c);
         
-        return commandExecutor.writeAsync(getName(), codec, RedisCommands.SREM_SINGLE, c.toArray());
+        return commandExecutor.writeAsync(getName(), codec, RedisCommands.SREM_SINGLE, args.toArray());
     }
 
     @Override
