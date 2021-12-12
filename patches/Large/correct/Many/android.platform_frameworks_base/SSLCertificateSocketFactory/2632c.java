diff --git a/core/java/android/net/SSLCertificateSocketFactory.java b/core/java/android/net/SSLCertificateSocketFactory.java
index a4b85e1..12e8791 100644
--- a/core/java/android/net/SSLCertificateSocketFactory.java
+++ b/core/java/android/net/SSLCertificateSocketFactory.java
@@ -533,7 +533,7 @@
 
     @Override
     public String[] getDefaultCipherSuites() {
-        return getDelegate().getSupportedCipherSuites();
+        return getDelegate().getDefaultCipherSuites();
     }
 
     @Override
