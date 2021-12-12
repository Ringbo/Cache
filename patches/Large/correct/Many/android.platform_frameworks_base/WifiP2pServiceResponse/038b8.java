diff --git a/wifi/java/android/net/wifi/p2p/nsd/WifiP2pServiceResponse.java b/wifi/java/android/net/wifi/p2p/nsd/WifiP2pServiceResponse.java
index 194c982..0ddfa77 100644
--- a/wifi/java/android/net/wifi/p2p/nsd/WifiP2pServiceResponse.java
+++ b/wifi/java/android/net/wifi/p2p/nsd/WifiP2pServiceResponse.java
@@ -334,7 +334,7 @@
         result = 31 * result + mTransId;
         result = 31 * result + (mDevice.deviceAddress == null ?
                 0 : mDevice.deviceAddress.hashCode());
-        result = 31 * result + (mData == null ? 0 : mData.hashCode());
+        result = 31 * result + (mData == null ? 0 : Arrays.hashCode(mData));
         return result;
     }
 
