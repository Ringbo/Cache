diff --git a/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/unit/WifiClientTest.java b/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/unit/WifiClientTest.java
index 6717bda..e0a3ee6 100644
--- a/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/unit/WifiClientTest.java
+++ b/core/tests/ConnectivityManagerTest/src/com/android/connectivitymanagertest/unit/WifiClientTest.java
@@ -77,7 +77,7 @@
         List<WifiConfiguration> configList = mWifiManager.getConfiguredNetworks();
         boolean found = false;
         for (WifiConfiguration c : configList) {
-            if (c.networkId == netId) {
+            if (c.networkId == netId && c.SSID.equals(config.SSID)) {
                 found = true;
             }
         }
