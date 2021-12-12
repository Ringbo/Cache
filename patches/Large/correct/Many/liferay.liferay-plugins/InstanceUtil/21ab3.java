diff --git a/clients/localization-client/src/com/liferay/localization/util/InstanceUtil.java b/clients/localization-client/src/com/liferay/localization/util/InstanceUtil.java
index 5b5c73f..4f89c12 100644
--- a/clients/localization-client/src/com/liferay/localization/util/InstanceUtil.java
+++ b/clients/localization-client/src/com/liferay/localization/util/InstanceUtil.java
@@ -60,7 +60,7 @@
 		// Regular roles
 
 		for (String name : PortalUtil.getSystemRoles()) {
-			Role role = RoleLocalServiceUtil.getRole(companyId, name);
+			Role role = RoleLocalServiceUtil.loadGetRole(companyId, name);
 
 			Map<Locale, String> descriptionMap = role.getDescriptionMap();
 			Map<Locale, String> titleMap = role.getTitleMap();
@@ -96,7 +96,7 @@
 		// Organization roles
 
 		for (String name : PortalUtil.getSystemOrganizationRoles()) {
-			Role role = RoleLocalServiceUtil.getRole(companyId, name);
+			Role role = RoleLocalServiceUtil.loadGetRole(companyId, name);
 
 			Map<Locale, String> descriptionMap = role.getDescriptionMap();
 			Map<Locale, String> titleMap = role.getTitleMap();
@@ -129,7 +129,7 @@
 		// Site roles
 
 		for (String name : PortalUtil.getSystemSiteRoles()) {
-			Role role = RoleLocalServiceUtil.getRole(companyId, name);
+			Role role = RoleLocalServiceUtil.loadGetRole(companyId, name);
 
 			Map<Locale, String> descriptionMap = role.getDescriptionMap();
 			Map<Locale, String> titleMap = role.getTitleMap();
