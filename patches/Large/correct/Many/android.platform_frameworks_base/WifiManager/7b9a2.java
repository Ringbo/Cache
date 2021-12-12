diff --git a/wifi/java/android/net/wifi/WifiManager.java b/wifi/java/android/net/wifi/WifiManager.java
index e4b510d..50ae905 100644
--- a/wifi/java/android/net/wifi/WifiManager.java
+++ b/wifi/java/android/net/wifi/WifiManager.java
@@ -1132,7 +1132,7 @@
      */
     private int addOrUpdateNetwork(WifiConfiguration config) {
         try {
-            return mService.addOrUpdateNetwork(config);
+            return mService.addOrUpdateNetwork(config, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1153,7 +1153,7 @@
      */
     public void addOrUpdatePasspointConfiguration(PasspointConfiguration config) {
         try {
-            if (!mService.addOrUpdatePasspointConfiguration(config)) {
+            if (!mService.addOrUpdatePasspointConfiguration(config, mContext.getOpPackageName())) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1170,7 +1170,7 @@
      */
     public void removePasspointConfiguration(String fqdn) {
         try {
-            if (!mService.removePasspointConfiguration(fqdn)) {
+            if (!mService.removePasspointConfiguration(fqdn, mContext.getOpPackageName())) {
                 throw new IllegalArgumentException();
             }
         } catch (RemoteException e) {
@@ -1256,7 +1256,7 @@
      */
     public boolean removeNetwork(int netId) {
         try {
-            return mService.removeNetwork(netId);
+            return mService.removeNetwork(netId, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1302,7 +1302,7 @@
 
         boolean success;
         try {
-            success = mService.enableNetwork(netId, attemptConnect);
+            success = mService.enableNetwork(netId, attemptConnect, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1328,7 +1328,7 @@
      */
     public boolean disableNetwork(int netId) {
         try {
-            return mService.disableNetwork(netId);
+            return mService.disableNetwork(netId, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -1341,7 +1341,7 @@
      */
     public boolean disconnect() {
         try {
-            mService.disconnect();
+            mService.disconnect(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1356,7 +1356,7 @@
      */
     public boolean reconnect() {
         try {
-            mService.reconnect();
+            mService.reconnect(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1371,7 +1371,7 @@
      */
     public boolean reassociate() {
         try {
-            mService.reassociate();
+            mService.reassociate(mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1701,7 +1701,7 @@
     @Deprecated
     public boolean saveConfiguration() {
         try {
-            return mService.saveConfiguration();
+            return mService.saveConfiguration(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -2136,7 +2136,7 @@
     @RequiresPermission(android.Manifest.permission.CHANGE_WIFI_STATE)
     public boolean setWifiApConfiguration(WifiConfiguration wifiConfig) {
         try {
-            mService.setWifiApConfiguration(wifiConfig);
+            mService.setWifiApConfiguration(wifiConfig, mContext.getOpPackageName());
             return true;
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -3052,7 +3052,7 @@
     public void disableEphemeralNetwork(String SSID) {
         if (SSID == null) throw new IllegalArgumentException("SSID cannot be null");
         try {
-            mService.disableEphemeralNetwork(SSID);
+            mService.disableEphemeralNetwork(SSID, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3093,7 +3093,7 @@
      */
     public Messenger getWifiServiceMessenger() {
         try {
-            return mService.getWifiServiceMessenger();
+            return mService.getWifiServiceMessenger(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -3619,7 +3619,7 @@
      */
     public void factoryReset() {
         try {
-            mService.factoryReset();
+            mService.factoryReset(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
