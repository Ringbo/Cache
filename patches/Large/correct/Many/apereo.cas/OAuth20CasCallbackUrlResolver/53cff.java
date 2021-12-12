diff --git a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/OAuth20CasCallbackUrlResolver.java b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/OAuth20CasCallbackUrlResolver.java
index 2e587d0..fc7aed0 100644
--- a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/OAuth20CasCallbackUrlResolver.java
+++ b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/web/OAuth20CasCallbackUrlResolver.java
@@ -24,11 +24,10 @@
         this.callbackUrl = callbackUrl;
     }
 
-
-    Optional<URIBuilder.BasicNameValuePair> getQueryParameter(final WebContext context, final String name) {
+    private Optional<URIBuilder.BasicNameValuePair> getQueryParameter(final WebContext context, final String name) {
         final URIBuilder builderContext = new URIBuilder(context.getFullRequestURL());
         return builderContext.getQueryParams()
-                .stream().filter(p -> p.getName().equals(OAuthConstants.CLIENT_ID))
+                .stream().filter(p -> p.getName().equalsIgnoreCase(name))
                 .findFirst();
     }
 
