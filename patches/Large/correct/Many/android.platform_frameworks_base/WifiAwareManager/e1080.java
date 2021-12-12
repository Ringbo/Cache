diff --git a/wifi/java/android/net/wifi/aware/WifiAwareManager.java b/wifi/java/android/net/wifi/aware/WifiAwareManager.java
index 166da48..d57d152 100644
--- a/wifi/java/android/net/wifi/aware/WifiAwareManager.java
+++ b/wifi/java/android/net/wifi/aware/WifiAwareManager.java
@@ -301,7 +301,7 @@
         if (VDBG) Log.v(TAG, "publish(): clientId=" + clientId + ", config=" + publishConfig);
 
         try {
-            mService.publish(clientId, publishConfig,
+            mService.publish(mContext.getOpPackageName(), clientId, publishConfig,
                     new WifiAwareDiscoverySessionCallbackProxy(this, looper, true, callback,
                             clientId));
         } catch (RemoteException e) {
@@ -334,7 +334,7 @@
         }
 
         try {
-            mService.subscribe(clientId, subscribeConfig,
+            mService.subscribe(mContext.getOpPackageName(), clientId, subscribeConfig,
                     new WifiAwareDiscoverySessionCallbackProxy(this, looper, false, callback,
                             clientId));
         } catch (RemoteException e) {
