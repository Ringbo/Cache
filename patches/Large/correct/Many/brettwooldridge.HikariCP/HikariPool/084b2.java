diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 02598fe..7fb48dc 100644
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -425,7 +425,7 @@
    protected final boolean addConnection()
    {
       // Speculative increment of totalConnections with expectation of success
-      if (totalConnections.incrementAndGet() <= configuration.getMaximumPoolSize()) {
+      if (totalConnections.incrementAndGet() > configuration.getMaximumPoolSize()) {
          totalConnections.decrementAndGet(); // Pool is maxed out, so undo speculative increment of totalConnections
          lastConnectionFailure.set(new SQLException(String.format("HikariCP pool %s is at maximum capacity", configuration.getPoolName())));
          return true;
