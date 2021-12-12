diff --git a/wifi/java/android/net/wifi/WifiStateMachine.java b/wifi/java/android/net/wifi/WifiStateMachine.java
index 23b1b44..bb09704 100644
--- a/wifi/java/android/net/wifi/WifiStateMachine.java
+++ b/wifi/java/android/net/wifi/WifiStateMachine.java
@@ -1240,14 +1240,14 @@
            ip settings */
         InterfaceConfiguration ifcg = null;
         try {
-            ifcg = mNwService.getInterfaceConfig(mInterfaceName);
+            ifcg = mNwService.getInterfaceConfig(mTetherInterfaceName);
             if (ifcg != null) {
                 ifcg.setLinkAddress(
                         new LinkAddress(NetworkUtils.numericToInetAddress("0.0.0.0"), 0));
-                mNwService.setInterfaceConfig(mInterfaceName, ifcg);
+                mNwService.setInterfaceConfig(mTetherInterfaceName, ifcg);
             }
         } catch (Exception e) {
-            loge("Error resetting interface " + mInterfaceName + ", :" + e);
+            loge("Error resetting interface " + mTetherInterfaceName + ", :" + e);
         }
 
         if (mCm.untether(mTetherInterfaceName) != ConnectivityManager.TETHER_ERROR_NO_ERROR) {
