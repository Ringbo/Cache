diff --git a/core/cas-server-core-cookie/src/main/java/org/apereo/cas/web/config/CasCookieConfiguration.java b/core/cas-server-core-cookie/src/main/java/org/apereo/cas/web/config/CasCookieConfiguration.java
index d6e2d93..577cac4 100644
--- a/core/cas-server-core-cookie/src/main/java/org/apereo/cas/web/config/CasCookieConfiguration.java
+++ b/core/cas-server-core-cookie/src/main/java/org/apereo/cas/web/config/CasCookieConfiguration.java
@@ -85,7 +85,7 @@
     @RefreshScope
     public CookieRetrievingCookieGenerator ticketGrantingTicketCookieGenerator(@Qualifier("cookieCipherExecutor") final CipherExecutor cipherExecutor) {
         final TicketGrantingCookieProperties tgc = casProperties.getTgc();
-        final int rememberMeMaxAge = (int) Beans.newDuration(tgc.getRememberMeMaxAge()).toMillis();
+        final int rememberMeMaxAge = (int) Beans.newDuration(tgc.getRememberMeMaxAge()).getSeconds();
         return new TGCCookieRetrievingCookieGenerator(cookieValueManager(cipherExecutor),
             tgc.getName(),
             tgc.getPath(),
