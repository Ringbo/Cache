diff --git a/redisson/src/test/java/org/redisson/RedisRunner.java b/redisson/src/test/java/org/redisson/RedisRunner.java
index 7012abb..e0990ff 100644
--- a/redisson/src/test/java/org/redisson/RedisRunner.java
+++ b/redisson/src/test/java/org/redisson/RedisRunner.java
@@ -68,7 +68,7 @@
         SLAVE_PRIORITY,
         MIN_SLAVES_TO_WRITE,
         MIN_SLAVES_MAX_LAG,
-        REQUREPASS,
+        REQUIREPASS,
         RENAME_COMMAND(true),
         MAXCLIENTS,
         MAXMEMORY,
@@ -552,7 +552,7 @@
     }
 
     public RedisRunner requirepass(String requirepass) {
-        addConfigOption(REDIS_OPTIONS.REQUREPASS, requirepass);
+        addConfigOption(REDIS_OPTIONS.REQUIREPASS, requirepass);
         return this;
     }
 
