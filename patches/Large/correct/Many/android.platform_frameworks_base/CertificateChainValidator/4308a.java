diff --git a/core/java/android/net/http/CertificateChainValidator.java b/core/java/android/net/http/CertificateChainValidator.java
index 3652a4c..1e476fc 100644
--- a/core/java/android/net/http/CertificateChainValidator.java
+++ b/core/java/android/net/http/CertificateChainValidator.java
@@ -138,7 +138,7 @@
     public static void handleTrustStorageUpdate() {
 
         try {
-            X509TrustManager x509TrustManager = SSLParametersImpl.getDefaultTrustManager();
+            X509TrustManager x509TrustManager = SSLParametersImpl.getDefaultX509TrustManager();
             if( x509TrustManager instanceof TrustManagerImpl ) {
                 TrustManagerImpl trustManager = (TrustManagerImpl) x509TrustManager;
                 trustManager.handleTrustStorageUpdate();
@@ -175,7 +175,7 @@
         }
 
         try {
-            X509TrustManager x509TrustManager = SSLParametersImpl.getDefaultTrustManager();
+            X509TrustManager x509TrustManager = SSLParametersImpl.getDefaultX509TrustManager();
             if (x509TrustManager instanceof TrustManagerImpl) {
                 TrustManagerImpl trustManager = (TrustManagerImpl) x509TrustManager;
                 trustManager.checkServerTrusted(chain, authType, domain);
