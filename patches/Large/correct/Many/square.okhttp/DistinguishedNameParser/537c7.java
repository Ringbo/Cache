diff --git a/okhttp/src/main/java/okhttp3/internal/tls/DistinguishedNameParser.java b/okhttp/src/main/java/okhttp3/internal/tls/DistinguishedNameParser.java
index 616bca5..cae8dfa 100644
--- a/okhttp/src/main/java/okhttp3/internal/tls/DistinguishedNameParser.java
+++ b/okhttp/src/main/java/okhttp3/internal/tls/DistinguishedNameParser.java
@@ -35,7 +35,7 @@
   /** Distinguished name characters. */
   private char[] chars;
 
-  public DistinguishedNameParser(X500Principal principal) {
+  DistinguishedNameParser(X500Principal principal) {
     // RFC2253 is used to ensure we get attributes in the reverse
     // order of the underlying ASN.1 encoding, so that the most
     // significant values of repeated attributes occur first.
