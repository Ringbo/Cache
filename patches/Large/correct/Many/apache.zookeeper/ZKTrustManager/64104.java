diff --git a/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKTrustManager.java b/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKTrustManager.java
index 73006d0..aa02145 100644
--- a/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKTrustManager.java
+++ b/zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKTrustManager.java
@@ -85,7 +85,7 @@
 
     @Override
     public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
-        x509ExtendedTrustManager.checkServerTrusted(chain, authType, engine);
+        x509ExtendedTrustManager.checkClientTrusted(chain, authType, engine);
         if (clientHostnameVerificationEnabled) {
             try {
                 performHostVerification(InetAddress.getByName(engine.getPeerHost()), chain[0]);
