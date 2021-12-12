diff --git a/services/java/com/android/server/ConnectivityService.java b/services/java/com/android/server/ConnectivityService.java
index 2a724d4..541a8cf 100644
--- a/services/java/com/android/server/ConnectivityService.java
+++ b/services/java/com/android/server/ConnectivityService.java
@@ -900,7 +900,7 @@
                         !network.isTeardownRequested()) {
                     if (ni.isConnected() == true) {
                         // add the pid-specific dns
-                        handleDnsConfigurationChange(networkType);
+                        handleDnsConfigurationChange(usedNetworkType);
                         if (DBG) log("special network already active");
                         return Phone.APN_ALREADY_ACTIVE;
                     }
