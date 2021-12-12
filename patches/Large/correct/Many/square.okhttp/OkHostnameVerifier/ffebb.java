diff --git a/okhttp/src/main/java/com/squareup/okhttp/internal/tls/OkHostnameVerifier.java b/okhttp/src/main/java/com/squareup/okhttp/internal/tls/OkHostnameVerifier.java
index e111f22..0b10f2a 100644
--- a/okhttp/src/main/java/com/squareup/okhttp/internal/tls/OkHostnameVerifier.java
+++ b/okhttp/src/main/java/com/squareup/okhttp/internal/tls/OkHostnameVerifier.java
@@ -53,7 +53,7 @@
   private static final int ALT_DNS_NAME = 2;
   private static final int ALT_IPA_NAME = 7;
 
-  public final boolean verify(String host, SSLSession session) {
+  public boolean verify(String host, SSLSession session) {
     try {
       Certificate[] certificates = session.getPeerCertificates();
       return verify(host, (X509Certificate) certificates[0]);
