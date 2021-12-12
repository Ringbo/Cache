diff --git a/presto-main/src/main/java/com/facebook/presto/server/security/AuthenticationFilter.java b/presto-main/src/main/java/com/facebook/presto/server/security/AuthenticationFilter.java
index ec62c72..d7b6c1a 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/security/AuthenticationFilter.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/security/AuthenticationFilter.java
@@ -96,7 +96,7 @@
         skipRequestBody(request);
 
         for (String value : authenticateHeaders) {
-            response.setHeader(WWW_AUTHENTICATE, value);
+            response.addHeader(WWW_AUTHENTICATE, value);
         }
 
         if (messages.isEmpty()) {
