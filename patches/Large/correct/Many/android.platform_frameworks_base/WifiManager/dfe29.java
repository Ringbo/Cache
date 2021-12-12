diff --git a/wifi/java/android/net/wifi/WifiManager.java b/wifi/java/android/net/wifi/WifiManager.java
index 95d38c8..c2959d5 100644
--- a/wifi/java/android/net/wifi/WifiManager.java
+++ b/wifi/java/android/net/wifi/WifiManager.java
@@ -1127,7 +1127,7 @@
      */
     private int addOrUpdateNetwork(WifiConfiguration config) {
         try {
-            return mService.addOrUpdateNetwork(config, mContext.getOpPackageName());
+            return mService.addOrUpdateNetwork(config);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1148,7 +1148,7 @@
      */
     public void addOrUpdatePasspointConfiguration(PasspointConfiguration config) {
         try {
-            if (!mService.addOrUpdatePasspointConfiguration(config, mContext.getOpPackageName())) {
+            if (!mService.addOrUpdatePasspointConfiguration(config)) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1165,7 +1165,7 @@
      */
     public void removePasspointConfiguration(String fqdn) {
         try {
-            if (!mService.removePasspointConfiguration(fqdn, mContext.getOpPackageName())) {
+            if (!mService.removePasspointConfiguration(fqdn)) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1251,7 +1251,7 @@
      */
     public boolean removeNetwork(int netId) {
         try {
-            return mService.removeNetwork(netId, mContext.getOpPackageName());
+            return mService.removeNetwork(netId);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1297,7 +1297,7 @@
 
         boolean success;
         try {
-            success = mService.enableNetwork(netId, attemptConnect, mContext.getOpPackageName());
+            success = mService.enableNetwork(netId, attemptConnect);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1323,7 +1323,7 @@
      */
     public boolean disableNetwork(int netId) {
         try {
-            return mService.disableNetwork(netId, mContext.getOpPackageName());
+            return mService.disableNetwork(netId);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1336,7 +1336,7 @@
      */
     public boolean disconnect() {
         try {
-            mService.disconnect(mContext.getOpPackageName());
+            mService.disconnect();
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1351,7 +1351,7 @@
      */
     public boolean reconnect() {
         try {
-            mService.reconnect(mContext.getOpPackageName());
+            mService.reconnect();
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1366,7 +1366,7 @@
      */
     public boolean reassociate() {
         try {
-            mService.reassociate(mContext.getOpPackageName());
+            mService.reassociate();
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1739,7 +1739,7 @@
     @Deprecated
     public boolean saveConfiguration() {
         try {
-            return mService.saveConfiguration(mContext.getOpPackageName());
+            return mService.saveConfiguration();
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -2060,7 +2060,7 @@
             }
             mLOHSCallbackProxy = null;
             try {
-                mService.stopLocalOnlyHotspot(mContext.getOpPackageName());
+                mService.stopLocalOnlyHotspot();
             } catch (RemoteException e) {
                 throw e.rethrowFromSystemServer();
             }
@@ -2179,7 +2179,7 @@
     @RequiresPermission(android.Manifest.permission.CHANGE_WIFI_STATE)
     public boolean setWifiApConfiguration(WifiConfiguration wifiConfig) {
         try {
-            mService.setWifiApConfiguration(wifiConfig, mContext.getOpPackageName());
+            mService.setWifiApConfiguration(wifiConfig);
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -2951,7 +2951,7 @@
     public void disableEphemeralNetwork(String SSID) {
         if (SSID == null) throw new IllegalArgumentException("SSID cannot be null");
         try {
-            mService.disableEphemeralNetwork(SSID, mContext.getOpPackageName());
+            mService.disableEphemeralNetwork(SSID);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -2990,7 +2990,7 @@
      */
     public Messenger getWifiServiceMessenger() {
         try {
-            return mService.getWifiServiceMessenger(mContext.getOpPackageName());
+            return mService.getWifiServiceMessenger();
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3519,7 +3519,7 @@
      */
     public void factoryReset() {
         try {
-            mService.factoryReset(mContext.getOpPackageName());
+            mService.factoryReset();
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3546,7 +3546,7 @@
      */
     public boolean setEnableAutoJoinWhenAssociated(boolean enabled) {
         try {
-            return mService.setEnableAutoJoinWhenAssociated(enabled, mContext.getOpPackageName());
+            return mService.setEnableAutoJoinWhenAssociated(enabled);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
