diff --git a/core/src/main/java/org/acegisecurity/providers/cas/CasAuthenticationProvider.java b/core/src/main/java/org/acegisecurity/providers/cas/CasAuthenticationProvider.java
index 66c9783..cd4b5fb 100644
--- a/core/src/main/java/org/acegisecurity/providers/cas/CasAuthenticationProvider.java
+++ b/core/src/main/java/org/acegisecurity/providers/cas/CasAuthenticationProvider.java
@@ -70,7 +70,7 @@
         Assert.notNull(this.ticketValidator, "A ticketValidator must be set");
         Assert.notNull(this.casProxyDecider, "A casProxyDecider must be set");
         Assert.notNull(this.statelessTicketCache, "A statelessTicketCache must be set");
-        Assert.notNull(this.key, "A Key is required so CasAuthenticationProvider can identify tokens it previously authenticated");
+        Assert.hasText(this.key, "A Key is required so CasAuthenticationProvider can identify tokens it previously authenticated");
         Assert.notNull(this.messages, "A message source must be set");
     }
 
