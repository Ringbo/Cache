diff --git a/samples/guide/src/main/java/okhttp3/recipes/CustomCipherSuites.java b/samples/guide/src/main/java/okhttp3/recipes/CustomCipherSuites.java
index a3ea23c..b568bdf 100644
--- a/samples/guide/src/main/java/okhttp3/recipes/CustomCipherSuites.java
+++ b/samples/guide/src/main/java/okhttp3/recipes/CustomCipherSuites.java
@@ -109,7 +109,7 @@
   static class DelegatingSSLSocketFactory extends SSLSocketFactory {
     protected final SSLSocketFactory delegate;
 
-    public DelegatingSSLSocketFactory(SSLSocketFactory delegate) {
+    DelegatingSSLSocketFactory(SSLSocketFactory delegate) {
       this.delegate = delegate;
     }
 
