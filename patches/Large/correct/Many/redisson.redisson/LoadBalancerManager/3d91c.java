diff --git a/redisson/src/main/java/org/redisson/connection/balancer/LoadBalancerManager.java b/redisson/src/main/java/org/redisson/connection/balancer/LoadBalancerManager.java
index 39ff6e8..07cb785 100644
--- a/redisson/src/main/java/org/redisson/connection/balancer/LoadBalancerManager.java
+++ b/redisson/src/main/java/org/redisson/connection/balancer/LoadBalancerManager.java
@@ -205,12 +205,12 @@
     }
 
     public void returnPubSubConnection(RedisPubSubConnection connection) {
-        ClientConnectionsEntry entry = ip2Entry.get(contains(connection.getRedisClient().getAddr()));
+        ClientConnectionsEntry entry = ip2Entry.get(convert(connection.getRedisClient().getAddr()));
         pubSubConnectionPool.returnConnection(entry, connection);
     }
 
     public void returnConnection(RedisConnection connection) {
-        ClientConnectionsEntry entry = ip2Entry.get(contains(connection.getRedisClient().getAddr()));
+        ClientConnectionsEntry entry = ip2Entry.get(convert(connection.getRedisClient().getAddr()));
         slaveConnectionPool.returnConnection(entry, connection);
     }
 
