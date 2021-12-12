diff --git a/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java b/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
index 65db467..df0384f 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
@@ -310,7 +310,7 @@
      * @throws IllegalArgumentException if the interval is negative.
      */
     public PoolingOptions setHeartbeatIntervalSeconds(int heartbeatIntervalSeconds) {
-        if (poolTimeoutMillis < 0)
+        if (heartbeatIntervalSeconds < 0)
             throw new IllegalArgumentException("Heartbeat interval must be positive");
 
         this.heartbeatIntervalSeconds = heartbeatIntervalSeconds;
