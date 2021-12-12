diff --git a/test/org/apache/tomcat/util/net/openssl/ciphers/TesterOpenSSL.java b/test/org/apache/tomcat/util/net/openssl/ciphers/TesterOpenSSL.java
index 4bf7a9da..8fc2b2c 100644
--- a/test/org/apache/tomcat/util/net/openssl/ciphers/TesterOpenSSL.java
+++ b/test/org/apache/tomcat/util/net/openssl/ciphers/TesterOpenSSL.java
@@ -373,7 +373,7 @@
             args.add("\"\"");
         }
         // Include the specification if provided
-        if (specification == null) {
+        if (specification != null) {
             args.add(specification);
         }
 
