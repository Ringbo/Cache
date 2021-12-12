diff --git a/core/java/android/app/usage/NetworkStatsManager.java b/core/java/android/app/usage/NetworkStatsManager.java
index 720c84a..7961a72 100644
--- a/core/java/android/app/usage/NetworkStatsManager.java
+++ b/core/java/android/app/usage/NetworkStatsManager.java
@@ -305,7 +305,8 @@
      */
     public void registerUsageCallback(int networkType, String subscriberId, long thresholdBytes,
             UsageCallback callback) {
-        registerUsageCallback(networkType, subscriberId, thresholdBytes, null /* handler */);
+        registerUsageCallback(networkType, subscriberId, thresholdBytes, callback,
+                null /* handler */);
     }
 
     /**
