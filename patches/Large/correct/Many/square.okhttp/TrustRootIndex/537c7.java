diff --git a/okhttp/src/main/java/okhttp3/internal/tls/TrustRootIndex.java b/okhttp/src/main/java/okhttp3/internal/tls/TrustRootIndex.java
index e42ad1b..b677203 100644
--- a/okhttp/src/main/java/okhttp3/internal/tls/TrustRootIndex.java
+++ b/okhttp/src/main/java/okhttp3/internal/tls/TrustRootIndex.java
@@ -103,7 +103,7 @@
   static final class BasicTrustRootIndex extends TrustRootIndex {
     private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;
 
-    public BasicTrustRootIndex(X509Certificate... caCerts) {
+    BasicTrustRootIndex(X509Certificate... caCerts) {
       subjectToCaCerts = new LinkedHashMap<>();
       for (X509Certificate caCert : caCerts) {
         X500Principal subject = caCert.getSubjectX500Principal();
