diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 619ef20..3d7242f 100644
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -438,7 +438,7 @@
          final long maxLifetime = config.getMaxLifetime();
          if (maxLifetime > 0) {
             // variance up to 2.5% of the maxlifetime
-            final long variance = maxLifetime > 10_000 ? ThreadLocalRandom.current().nextLong( Math.max(10_000, maxLifetime / 40) ) : 0;
+            final long variance = maxLifetime > 10_000 ? ThreadLocalRandom.current().nextLong( maxLifetime / 40 ) : 0;
             final long lifetime = maxLifetime - variance;
             poolEntry.setFutureEol(houseKeepingExecutorService.schedule(new Runnable() {
                @Override
@@ -573,7 +573,7 @@
 
             // failed to get connection from db, sleep and retry
             quietlySleep(sleepBackoff);
-            sleepBackoff = Math.min(connectionTimeout / 2, (long) (sleepBackoff * 1.3));
+            sleepBackoff = Math.min(connectionTimeout / 4, (long) (sleepBackoff * 1.3));
          }
          // Pool is suspended or shutdown or at max size
          return Boolean.FALSE;
