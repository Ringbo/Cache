diff --git a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20CallbackAuthorizeController.java b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20CallbackAuthorizeController.java
index d0c7dab..741d2b1 100644
--- a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20CallbackAuthorizeController.java
+++ b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20CallbackAuthorizeController.java
@@ -59,7 +59,7 @@
         session.removeAttribute(OAuthConstants.OAUTH20_CALLBACKURL);
 
         if (StringUtils.isBlank(callbackUrl)) {
-            log.error("{} is missing from the session and can not be retrieved.", OAuthConstants.OAUTH20_CALLBACKURL);
+            logger.error("{} is missing from the session and can not be retrieved.", OAuthConstants.OAUTH20_CALLBACKURL);
             return new ModelAndView(OAuthConstants.ERROR_VIEW);
         }
         // and state
