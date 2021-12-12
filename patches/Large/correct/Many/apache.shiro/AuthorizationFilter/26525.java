diff --git a/web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java b/web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java
index ff3b755..72aa0fa 100644
--- a/web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java
+++ b/web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java
@@ -115,7 +115,7 @@
         } else {
             // If subject is known but not authorized, redirect to the unauthorized URL if there is one
             // If no unauthorized URL is specified, just return an unauthorized HTTP status code
-            WebUtils.toHttp(response).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
+            WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
             if (StringUtils.hasText(getUnauthorizedUrl())) {
                 WebUtils.issueRedirect(request, response, getUnauthorizedUrl());
             }
