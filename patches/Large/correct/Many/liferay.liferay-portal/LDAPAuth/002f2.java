diff --git a/modules/portal/portal-ldap/src/com/liferay/portal/ldap/internal/authenticator/LDAPAuth.java b/modules/portal/portal-ldap/src/com/liferay/portal/ldap/internal/authenticator/LDAPAuth.java
index b6a1987d..f5b41d5 100644
--- a/modules/portal/portal-ldap/src/com/liferay/portal/ldap/internal/authenticator/LDAPAuth.java
+++ b/modules/portal/portal-ldap/src/com/liferay/portal/ldap/internal/authenticator/LDAPAuth.java
@@ -394,7 +394,7 @@
 		LDAPAuthConfiguration ldapAuthConfiguration =
 			_ldapAuthConfigurationProvider.getConfiguration(companyId);
 
-		if (ldapAuthConfiguration.enabled()) {
+		if (!ldapAuthConfiguration.enabled()) {
 			if (_log.isDebugEnabled()) {
 				_log.debug("Authenticator is not enabled");
 			}
