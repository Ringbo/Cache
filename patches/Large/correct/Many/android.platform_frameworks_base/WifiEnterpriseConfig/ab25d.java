diff --git a/wifi/java/android/net/wifi/WifiEnterpriseConfig.java b/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
index 9e15d60..394934f 100644
--- a/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
+++ b/wifi/java/android/net/wifi/WifiEnterpriseConfig.java
@@ -719,7 +719,7 @@
      * Get CA certificates.
      */
     @Nullable public X509Certificate[] getCaCertificates() {
-        if (mCaCerts != null || mCaCerts.length > 0) {
+        if (mCaCerts != null && mCaCerts.length > 0) {
             return mCaCerts;
         } else {
             return null;
