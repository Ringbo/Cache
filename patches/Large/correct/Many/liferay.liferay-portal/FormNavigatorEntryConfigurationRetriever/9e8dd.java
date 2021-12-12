diff --git a/modules/apps/foundation/frontend-taglib/frontend-taglib-form-navigator/src/main/java/com/liferay/frontend/taglib/form/navigator/internal/configuration/FormNavigatorEntryConfigurationRetriever.java b/modules/apps/foundation/frontend-taglib/frontend-taglib-form-navigator/src/main/java/com/liferay/frontend/taglib/form/navigator/internal/configuration/FormNavigatorEntryConfigurationRetriever.java
index 63fbfbf..6be0f48 100644
--- a/modules/apps/foundation/frontend-taglib/frontend-taglib-form-navigator/src/main/java/com/liferay/frontend/taglib/form/navigator/internal/configuration/FormNavigatorEntryConfigurationRetriever.java
+++ b/modules/apps/foundation/frontend-taglib/frontend-taglib-form-navigator/src/main/java/com/liferay/frontend/taglib/form/navigator/internal/configuration/FormNavigatorEntryConfigurationRetriever.java
@@ -61,7 +61,7 @@
 
 			if (formNavigatorEntryKeys == null) {
 				formNavigatorEntryKeys =
-					formNavigatorEntryKeysProperties.getProperty(context);
+					formNavigatorEntryKeysProperties.getProperty(categoryKey);
 			}
 
 			if (formNavigatorEntryKeys != null) {
