diff --git a/wifi/java/android/net/wifi/WifiEnterpriseConfig.java b/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
index 964bfa2..30623e6 100644
--- a/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
+++ b/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
@@ -750,7 +750,7 @@
      * Get CA certificates.
      */
     @Nullable public X509Certificate[] getCaCertificates() {
-        if (mCaCerts != null || mCaCerts.length > 0) {
+        if (mCaCerts != null && mCaCerts.length > 0) {
             return mCaCerts;
         } else {
             return null;
