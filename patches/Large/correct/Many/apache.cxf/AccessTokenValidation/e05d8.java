diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/common/AccessTokenValidation.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/common/AccessTokenValidation.java
index d005894..8a85509 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/common/AccessTokenValidation.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/common/AccessTokenValidation.java
@@ -57,7 +57,7 @@
         this.tokenType = token.getTokenType();
         this.tokenGrantType = token.getGrantType();
         this.tokenIssuedAt = token.getIssuedAt();
-        this.tokenLifetime = token.getLifetime();
+        this.tokenLifetime = token.getExpiresIn();
         
         this.tokenSubject = token.getSubject();
         this.tokenScopes = token.getScopes();        
