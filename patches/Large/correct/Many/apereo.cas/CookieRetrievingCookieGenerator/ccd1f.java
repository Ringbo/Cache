diff --git a/core/cas-server-core-cookie-api/src/main/java/org/apereo/cas/web/support/CookieRetrievingCookieGenerator.java b/core/cas-server-core-cookie-api/src/main/java/org/apereo/cas/web/support/CookieRetrievingCookieGenerator.java
index ab3579e..9806b86 100644
--- a/core/cas-server-core-cookie-api/src/main/java/org/apereo/cas/web/support/CookieRetrievingCookieGenerator.java
+++ b/core/cas-server-core-cookie-api/src/main/java/org/apereo/cas/web/support/CookieRetrievingCookieGenerator.java
@@ -104,7 +104,7 @@
     private boolean isRememberMeAuthentication(final RequestContext requestContext) {
         final HttpServletRequest request = WebUtils.getHttpServletRequestFromExternalWebflowContext(requestContext);
         final String value = request.getParameter(RememberMeCredential.REQUEST_PARAMETER_REMEMBER_ME);
-        return StringUtils.isNotBlank(value) || WebUtils.isRememberMeAuthenticationEnabled(requestContext);
+        return StringUtils.isNotBlank(value) && WebUtils.isRememberMeAuthenticationEnabled(requestContext);
     }
 
     /**
