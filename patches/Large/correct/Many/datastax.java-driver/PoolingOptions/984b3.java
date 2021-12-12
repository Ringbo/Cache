diff --git a/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java b/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
index 5b0b89b..db4b492 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/PoolingOptions.java
@@ -336,7 +336,7 @@
      * @throws IllegalArgumentException if the interval is negative.
      */
     public PoolingOptions setHeartbeatIntervalSeconds(int heartbeatIntervalSeconds) {
-        if (poolTimeoutMillis < 0)
+        if (heartbeatIntervalSeconds < 0)
             throw new IllegalArgumentException("Heartbeat interval must be positive");
 
         this.heartbeatIntervalSeconds = heartbeatIntervalSeconds;
