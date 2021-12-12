diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 19b49e7..3a87b7f 100644
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -167,7 +167,7 @@
             final long now = clockSource.currentTime();
             if (poolEntry.evict || (clockSource.elapsedMillis(poolEntry.lastAccessed, now) > ALIVE_BYPASS_WINDOW_MS && !isConnectionAlive(poolEntry.connection))) {
                closeConnection(poolEntry, "(connection evicted or dead)"); // Throw away the dead connection and try again
-               timeout = hardTimeout - clockSource.elapsedMillis(startTime, now);
+               timeout = hardTimeout - clockSource.elapsedMillis(startTime);
             }
             else {
                metricsTracker.recordBorrowStats(poolEntry, startTime);
