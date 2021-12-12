diff --git a/java/org/apache/catalina/authenticator/FormAuthenticator.java b/java/org/apache/catalina/authenticator/FormAuthenticator.java
index feafb3b..d516f3a 100644
--- a/java/org/apache/catalina/authenticator/FormAuthenticator.java
+++ b/java/org/apache/catalina/authenticator/FormAuthenticator.java
@@ -562,7 +562,7 @@
 
         // Swallow any request body since we will be replacing it
         byte[] buffer = new byte[4096];
-        InputStream is = request.getInputStream();
+        InputStream is = request.createInputStream();
         while (is.read(buffer) >= 0) {
             // Ignore request body
         }
