diff --git a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
index 9bee490..5669eb3 100644
--- a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
+++ b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
@@ -294,7 +294,7 @@
 		PluginPackage soPortletPluginPackage =
 			DeployManagerUtil.getInstalledPluginPackage("so-portlet");
 
-		syncContext.setPreferences(getPortletPreferencesMap());
+		syncContext.setPortletPreferencesMap(getPortletPreferencesMap());
 
 		if (soPortletPluginPackage != null) {
 			syncContext.setSocialOfficeInstalled(true);
