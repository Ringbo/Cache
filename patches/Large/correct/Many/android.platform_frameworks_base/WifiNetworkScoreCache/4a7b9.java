diff --git a/wifi/java/android/net/wifi/WifiNetworkScoreCache.java b/wifi/java/android/net/wifi/WifiNetworkScoreCache.java
index 04dea1b..f61dfdc 100755
--- a/wifi/java/android/net/wifi/WifiNetworkScoreCache.java
+++ b/wifi/java/android/net/wifi/WifiNetworkScoreCache.java
@@ -145,7 +145,7 @@
         if (network != null && network.rssiCurve != null) {
             score = network.rssiCurve.lookupScore(result.level);
             if (DBG) {
-                Log.e(TAG, "getNetworkScore found scored network " + network.networkKey
+                Log.d(TAG, "getNetworkScore found scored network " + network.networkKey
                         + " score " + Integer.toString(score)
                         + " RSSI " + result.level);
             }
@@ -171,7 +171,7 @@
         if (network != null && network.rssiCurve != null) {
             score = network.rssiCurve.lookupScore(result.level, isActiveNetwork);
             if (DBG) {
-                Log.e(TAG, "getNetworkScore found scored network " + network.networkKey
+                Log.d(TAG, "getNetworkScore found scored network " + network.networkKey
                         + " score " + Integer.toString(score)
                         + " RSSI " + result.level
                         + " isActiveNetwork " + isActiveNetwork);
