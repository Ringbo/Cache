diff --git a/web/src/main/java/org/springframework/security/web/authentication/SimpleUrlAuthenticationFailureHandler.java b/web/src/main/java/org/springframework/security/web/authentication/SimpleUrlAuthenticationFailureHandler.java
index cc1824a..022f293 100644
--- a/web/src/main/java/org/springframework/security/web/authentication/SimpleUrlAuthenticationFailureHandler.java
+++ b/web/src/main/java/org/springframework/security/web/authentication/SimpleUrlAuthenticationFailureHandler.java
@@ -66,7 +66,8 @@
      * @param defaultFailureUrl the failure URL, for example "/loginFailed.jsp".
      */
     public void setDefaultFailureUrl(String defaultFailureUrl) {
-        Assert.isTrue(UrlUtils.isValidRedirectUrl(defaultFailureUrl));
+        Assert.isTrue(UrlUtils.isValidRedirectUrl(defaultFailureUrl),
+                "'" + defaultFailureUrl + "' is not a valid redirect URL");
         this.defaultFailureUrl = defaultFailureUrl;
     }
 
