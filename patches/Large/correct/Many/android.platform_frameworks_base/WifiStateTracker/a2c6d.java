diff --git a/wifi/java/android/net/wifi/WifiStateTracker.java b/wifi/java/android/net/wifi/WifiStateTracker.java
index 978d821..3813015 100644
--- a/wifi/java/android/net/wifi/WifiStateTracker.java
+++ b/wifi/java/android/net/wifi/WifiStateTracker.java
@@ -156,7 +156,7 @@
      * See {@link Settings.Secure#WIFI_MAX_DHCP_RETRY_COUNT}. This is the default
      * value if a Settings value is not present.
      */
-    private static final int DEFAULT_MAX_DHCP_RETRIES = 2;
+    private static final int DEFAULT_MAX_DHCP_RETRIES = 9;
 
     private static final int DRIVER_POWER_MODE_AUTO = 0;
     private static final int DRIVER_POWER_MODE_ACTIVE = 1;
@@ -1100,16 +1100,15 @@
                 String BSSID = (msg.obj != null) ? msg.obj.toString() : null;
                 /**
                  * If we've exceeded the maximum number of retries for reconnecting
-                 * to a given network, blacklist the BSSID to allow a connection attempt on
-                 * an alternate BSSID if available
+                 * to a given network, disable the network
                  */
                 if (mWifiInfo.getSupplicantState() != SupplicantState.UNINITIALIZED) {
                     if (++mReconnectCount > getMaxDhcpRetries()) {
                         if (LOCAL_LOGD) {
                             Log.d(TAG, "Failed reconnect count: " +
-                                    mReconnectCount + " Blacklisting " + BSSID);
+                                    mReconnectCount + " Disabling " + BSSID);
                         }
-                        addToBlacklist(BSSID);
+                        mWM.disableNetwork(mLastNetworkId);
                     }
                     reconnectCommand();
                 }
