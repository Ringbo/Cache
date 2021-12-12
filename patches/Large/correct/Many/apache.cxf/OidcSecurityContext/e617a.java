diff --git a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcSecurityContext.java b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcSecurityContext.java
index 14dd8c3..2e0e04e 100644
--- a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcSecurityContext.java
+++ b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcSecurityContext.java
@@ -28,7 +28,7 @@
 public class OidcSecurityContext extends SimpleSecurityContext implements SecurityContext {
     private OidcClientTokenContext oidcContext;
     public OidcSecurityContext(IdToken token) {
-        this(new OidcClientTokenContextImpl());
+        this(new OidcClientTokenContextImpl(token));
     }
     public OidcSecurityContext(OidcClientTokenContext oidcContext) {
         super(getUserName(oidcContext));
