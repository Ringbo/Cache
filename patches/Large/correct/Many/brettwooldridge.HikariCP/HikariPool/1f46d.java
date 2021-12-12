diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 4df7f62..3da38a2 100644
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -617,7 +617,7 @@
             }
             else if (now > clockSource.plusMillis(previous, (3 * HOUSEKEEPING_PERIOD_MS) / 2)) {
                // No point evicting for forward clock motion, this merely accelerates connection retirement anyway
-               LOGGER.warn("{} - Thread starvation or clock leap detected (housekeeper delta={}).", clockSource.elapsedDisplayString(previous, now), poolName);
+               LOGGER.warn("{} - Thread starvation or clock leap detected (housekeeper delta={}).", poolName, clockSource.elapsedDisplayString(previous, now));
             }
    
             previous = now;
