diff --git a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-web/src/main/java/com/liferay/dynamic/data/lists/web/upgrade/v1_0_0/UpgradeDDLFormPortletId.java b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-web/src/main/java/com/liferay/dynamic/data/lists/web/upgrade/v1_0_0/UpgradeDDLFormPortletId.java
index 20ef828..a2ad3b5 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-web/src/main/java/com/liferay/dynamic/data/lists/web/upgrade/v1_0_0/UpgradeDDLFormPortletId.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-web/src/main/java/com/liferay/dynamic/data/lists/web/upgrade/v1_0_0/UpgradeDDLFormPortletId.java
@@ -97,7 +97,7 @@
 
 		Property scopeProperty = PropertyFactoryUtil.forName("scope");
 
-		dynamicQuery.add(scopeProperty.eq(name));
+		dynamicQuery.add(scopeProperty.eq(scope));
 
 		Property roleIdProperty = PropertyFactoryUtil.forName("roleId");
 
