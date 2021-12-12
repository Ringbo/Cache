diff --git a/src/main/java/redis/clients/jedis/JedisSentinelPool.java b/src/main/java/redis/clients/jedis/JedisSentinelPool.java
index 05672f7..1140fdc 100644
--- a/src/main/java/redis/clients/jedis/JedisSentinelPool.java
+++ b/src/main/java/redis/clients/jedis/JedisSentinelPool.java
@@ -298,7 +298,7 @@
             }
           }, "+switch-master");
 
-        } catch (JedisConnectionException e) {
+        } catch (JedisException e) {
 
           if (running.get()) {
             log.log(Level.SEVERE, "Lost connection to Sentinel at " + host + ":" + port
