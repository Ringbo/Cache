diff --git a/support/cas-server-support-ldap/src/main/java/org/apereo/cas/authentication/LdapAuthenticationHandler.java b/support/cas-server-support-ldap/src/main/java/org/apereo/cas/authentication/LdapAuthenticationHandler.java
index a6d961f..7d5776a 100644
--- a/support/cas-server-support-ldap/src/main/java/org/apereo/cas/authentication/LdapAuthenticationHandler.java
+++ b/support/cas-server-support-ldap/src/main/java/org/apereo/cas/authentication/LdapAuthenticationHandler.java
@@ -249,7 +249,8 @@
                             this.principalIdAttribute, ldapEntry.getAttributes(), username);
                     return username;
                 }
-                LOGGER.error("The principal id attribute [{}] is not found. CAS is configured to disallow missing principal attributes");
+                LOGGER.error("The principal id attribute [{}] is not found. CAS is configured to disallow missing principal attributes",
+                        this.principalIdAttribute);
                 throw new LoginException("Principal id attribute is not found for " + principalAttr);
             }
 
