diff --git a/core/java/android/net/SSLCertificateSocketFactory.java b/core/java/android/net/SSLCertificateSocketFactory.java
index 208b212..b0278d3 100644
--- a/core/java/android/net/SSLCertificateSocketFactory.java
+++ b/core/java/android/net/SSLCertificateSocketFactory.java
@@ -533,7 +533,7 @@
 
     @Override
     public String[] getDefaultCipherSuites() {
-        return getDelegate().getSupportedCipherSuites();
+        return getDelegate().getDefaultCipherSuites();
     }
 
     @Override
