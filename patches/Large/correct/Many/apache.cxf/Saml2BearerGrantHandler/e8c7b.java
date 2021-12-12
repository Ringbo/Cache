diff --git a/rt/rs/security/oauth-parent/oauth2-saml/src/main/java/org/apache/cxf/rs/security/oauth2/grants/saml/Saml2BearerGrantHandler.java b/rt/rs/security/oauth-parent/oauth2-saml/src/main/java/org/apache/cxf/rs/security/oauth2/grants/saml/Saml2BearerGrantHandler.java
index c989109..36e9e68 100644
--- a/rt/rs/security/oauth-parent/oauth2-saml/src/main/java/org/apache/cxf/rs/security/oauth2/grants/saml/Saml2BearerGrantHandler.java
+++ b/rt/rs/security/oauth-parent/oauth2-saml/src/main/java/org/apache/cxf/rs/security/oauth2/grants/saml/Saml2BearerGrantHandler.java
@@ -138,7 +138,7 @@
             SAMLSecurityContext jaxrsSc = (SAMLSecurityContext)sc;
             Set<Principal> rolesP = jaxrsSc.getUserRoles();
             List<String> roles = new ArrayList<>();
-            if (roles != null) {
+            if (rolesP != null) {
                 for (Principal p : rolesP) {
                     roles.add(p.getName());
                 }
