diff --git a/src/main/java/org/redisson/connection/IdleConnectionWatcher.java b/src/main/java/org/redisson/connection/IdleConnectionWatcher.java
index 29d537a..0813ae1 100644
--- a/src/main/java/org/redisson/connection/IdleConnectionWatcher.java
+++ b/src/main/java/org/redisson/connection/IdleConnectionWatcher.java
@@ -84,7 +84,7 @@
     }
 
     private boolean validateAmount(Entry entry) {
-        return entry.maximumAmount - entry.freeConnectionsCounter.get() + entry.connections.size() >= entry.minimumAmount;
+        return entry.maximumAmount - entry.freeConnectionsCounter.get() + entry.connections.size() > entry.minimumAmount;
     }
 
     public void add(int minimumAmount, int maximumAmount, Collection<? extends RedisConnection> connections, AtomicInteger freeConnectionsCounter) {
