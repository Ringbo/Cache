diff --git a/core/src/main/java/org/acegisecurity/ui/AbstractProcessingFilter.java b/core/src/main/java/org/acegisecurity/ui/AbstractProcessingFilter.java
index 9ca30de..7c6baef 100644
--- a/core/src/main/java/org/acegisecurity/ui/AbstractProcessingFilter.java
+++ b/core/src/main/java/org/acegisecurity/ui/AbstractProcessingFilter.java
@@ -330,8 +330,7 @@
 
                 httpRequest.getSession().setAttribute(ACEGI_SECURITY_LAST_EXCEPTION_KEY,
                     failed);
-                httpRequest.getSession().setAttribute(HttpSessionIntegrationFilter.ACEGI_SECURITY_AUTHENTICATION_KEY,
-                    null);
+                httpRequest.getSession().removeAttribute(HttpSessionIntegrationFilter.ACEGI_SECURITY_AUTHENTICATION_KEY);
                 httpResponse.sendRedirect(httpResponse.encodeRedirectURL(httpRequest
                         .getContextPath() + failureUrl));
 
@@ -347,8 +346,7 @@
                 authResult);
 
             String targetUrl = (String) httpRequest.getSession().getAttribute(ACEGI_SECURITY_TARGET_URL_KEY);
-            httpRequest.getSession().setAttribute(ACEGI_SECURITY_TARGET_URL_KEY,
-                null);
+            httpRequest.getSession().removeAttribute(ACEGI_SECURITY_TARGET_URL_KEY);
 
             if (targetUrl == null) {
                 targetUrl = httpRequest.getContextPath() + defaultTargetUrl;
