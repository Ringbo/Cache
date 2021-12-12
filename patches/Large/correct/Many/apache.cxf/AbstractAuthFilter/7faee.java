diff --git a/rt/rs/security/oauth-parent/oauth/src/main/java/org/apache/cxf/rs/security/oauth/filters/AbstractAuthFilter.java b/rt/rs/security/oauth-parent/oauth/src/main/java/org/apache/cxf/rs/security/oauth/filters/AbstractAuthFilter.java
index 8f08430..c2f79cc 100644
--- a/rt/rs/security/oauth-parent/oauth/src/main/java/org/apache/cxf/rs/security/oauth/filters/AbstractAuthFilter.java
+++ b/rt/rs/security/oauth-parent/oauth/src/main/java/org/apache/cxf/rs/security/oauth/filters/AbstractAuthFilter.java
@@ -280,7 +280,7 @@
     }
 
     private class CustomHttpServletWrapper extends HttpServletRequestWrapper {
-        public CustomHttpServletWrapper(HttpServletRequest req) {
+        CustomHttpServletWrapper(HttpServletRequest req) {
             super(req);
         }
         
