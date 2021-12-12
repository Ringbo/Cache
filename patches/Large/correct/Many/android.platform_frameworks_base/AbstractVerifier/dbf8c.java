diff --git a/core/java/org/apache/http/conn/ssl/AbstractVerifier.java b/core/java/org/apache/http/conn/ssl/AbstractVerifier.java
index 66a5121..b9349b39 100644
--- a/core/java/org/apache/http/conn/ssl/AbstractVerifier.java
+++ b/core/java/org/apache/http/conn/ssl/AbstractVerifier.java
@@ -208,8 +208,8 @@
     }
 
     public static String[] getCNs(X509Certificate cert) {
-        DistinguishedNameParser dnParser =
-                new DistinguishedNameParser(cert.getSubjectX500Principal());
+        AndroidDistinguishedNameParser dnParser =
+                new AndroidDistinguishedNameParser(cert.getSubjectX500Principal());
         List<String> cnList = dnParser.getAllMostSpecificFirst("cn");
 
         if(!cnList.isEmpty()) {
