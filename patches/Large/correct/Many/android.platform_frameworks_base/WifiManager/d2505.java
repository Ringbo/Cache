diff --git a/wifi/java/android/net/wifi/WifiManager.java b/wifi/java/android/net/wifi/WifiManager.java
index c499edc..bc37810 100644
--- a/wifi/java/android/net/wifi/WifiManager.java
+++ b/wifi/java/android/net/wifi/WifiManager.java
@@ -1643,7 +1643,7 @@
      */
     public WifiInfo getConnectionInfo() {
         try {
-            return mService.getConnectionInfo();
+            return mService.getConnectionInfo(mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
