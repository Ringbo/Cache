diff --git a/wifi/java/android/net/wifi/WifiManager.java b/wifi/java/android/net/wifi/WifiManager.java
index c2959d5..95d38c8 100644
--- a/wifi/java/android/net/wifi/WifiManager.java
+++ b/wifi/java/android/net/wifi/WifiManager.java
@@ -1127,7 +1127,7 @@
      */
     private int addOrUpdateNetwork(WifiConfiguration config) {
         try {
-            return mService.addOrUpdateNetwork(config);
+            return mService.addOrUpdateNetwork(config, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1148,7 +1148,7 @@
      */
     public void addOrUpdatePasspointConfiguration(PasspointConfiguration config) {
         try {
-            if (!mService.addOrUpdatePasspointConfiguration(config)) {
+            if (!mService.addOrUpdatePasspointConfiguration(config, mContext.getOpPackageName())) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1165,7 +1165,7 @@
      */
     public void removePasspointConfiguration(String fqdn) {
         try {
-            if (!mService.removePasspointConfiguration(fqdn)) {
+            if (!mService.removePasspointConfiguration(fqdn, mContext.getOpPackageName())) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1251,7 +1251,7 @@
      */
     public boolean removeNetwork(int netId) {
         try {
-            return mService.removeNetwork(netId);
+            return mService.removeNetwork(netId, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1297,7 +1297,7 @@
 
         boolean success;
         try {
-            success = mService.enableNetwork(netId, attemptConnect);
+            success = mService.enableNetwork(netId, attemptConnect, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1323,7 +1323,7 @@
      */
     public boolean disableNetwork(int netId) {
         try {
-            return mService.disableNetwork(netId);
+            return mService.disableNetwork(netId, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1336,7 +1336,7 @@
      */
     public boolean disconnect() {
         try {
-            mService.disconnect();
+            mService.disconnect(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1351,7 +1351,7 @@
      */
     public boolean reconnect() {
         try {
-            mService.reconnect();
+            mService.reconnect(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1366,7 +1366,7 @@
      */
     public boolean reassociate() {
         try {
-            mService.reassociate();
+            mService.reassociate(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1739,7 +1739,7 @@
     @Deprecated
     public boolean saveConfiguration() {
         try {
-            return mService.saveConfiguration();
+            return mService.saveConfiguration(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -2060,7 +2060,7 @@
             }
             mLOHSCallbackProxy = null;
             try {
-                mService.stopLocalOnlyHotspot();
+                mService.stopLocalOnlyHotspot(mContext.getOpPackageName());
             } catch (RemoteException e) {
                 throw e.rethrowFromSystemServer();
             }
@@ -2179,7 +2179,7 @@
     @RequiresPermission(android.Manifest.permission.CHANGE_WIFI_STATE)
     public boolean setWifiApConfiguration(WifiConfiguration wifiConfig) {
         try {
-            mService.setWifiApConfiguration(wifiConfig);
+            mService.setWifiApConfiguration(wifiConfig, mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -2951,7 +2951,7 @@
     public void disableEphemeralNetwork(String SSID) {
         if (SSID == null) throw new IllegalArgumentException("SSID cannot be null");
         try {
-            mService.disableEphemeralNetwork(SSID);
+            mService.disableEphemeralNetwork(SSID, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -2990,7 +2990,7 @@
      */
     public Messenger getWifiServiceMessenger() {
         try {
-            return mService.getWifiServiceMessenger();
+            return mService.getWifiServiceMessenger(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3519,7 +3519,7 @@
      */
     public void factoryReset() {
         try {
-            mService.factoryReset();
+            mService.factoryReset(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3546,7 +3546,7 @@
      */
     public boolean setEnableAutoJoinWhenAssociated(boolean enabled) {
         try {
-            return mService.setEnableAutoJoinWhenAssociated(enabled);
+            return mService.setEnableAutoJoinWhenAssociated(enabled, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
