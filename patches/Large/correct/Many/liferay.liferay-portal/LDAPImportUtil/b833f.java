diff --git a/portal-ejb/src/com/liferay/portal/security/ldap/LDAPImportUtil.java b/portal-ejb/src/com/liferay/portal/security/ldap/LDAPImportUtil.java
index 71406f0..7e8d08f 100644
--- a/portal-ejb/src/com/liferay/portal/security/ldap/LDAPImportUtil.java
+++ b/portal-ejb/src/com/liferay/portal/security/ldap/LDAPImportUtil.java
@@ -312,7 +312,7 @@
 
 		// Import and add user to group
 
-		if (user == null) {
+		if (user != null) {
 			Attribute attr = attrs.get(userMappings.getProperty("group"));
 
 			for (int i = 0; i < attr.size(); i++) {
