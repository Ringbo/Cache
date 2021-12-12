diff --git a/wifi/java/android/net/wifi/WifiStateMachine.java b/wifi/java/android/net/wifi/WifiStateMachine.java
index ab9db88..db539e4 100644
--- a/wifi/java/android/net/wifi/WifiStateMachine.java
+++ b/wifi/java/android/net/wifi/WifiStateMachine.java
@@ -1624,7 +1624,7 @@
         Intent intent = new Intent(WifiManager.RSSI_CHANGED_ACTION);
         intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT);
         intent.putExtra(WifiManager.EXTRA_NEW_RSSI, newRssi);
-        mContext.sendBroadcastAsUser(intent, UserHandle.ALL);
+        mContext.sendStickyBroadcastAsUser(intent, UserHandle.ALL);
     }
 
     private void sendNetworkStateChangeBroadcast(String bssid) {
