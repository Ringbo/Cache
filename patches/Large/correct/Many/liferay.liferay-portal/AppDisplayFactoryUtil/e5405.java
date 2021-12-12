diff --git a/modules/apps/marketplace/marketplace-app-manager-web/src/main/java/com/liferay/marketplace/app/manager/web/util/AppDisplayFactoryUtil.java b/modules/apps/marketplace/marketplace-app-manager-web/src/main/java/com/liferay/marketplace/app/manager/web/util/AppDisplayFactoryUtil.java
index be1f4d3..af95373 100644
--- a/modules/apps/marketplace/marketplace-app-manager-web/src/main/java/com/liferay/marketplace/app/manager/web/util/AppDisplayFactoryUtil.java
+++ b/modules/apps/marketplace/marketplace-app-manager-web/src/main/java/com/liferay/marketplace/app/manager/web/util/AppDisplayFactoryUtil.java
@@ -130,7 +130,7 @@
 		List<Module> modules = _moduleLocalService.getModules(app.getAppId());
 
 		for (Module module : modules) {
-			Bundle bundle = bundlesMap.get(module);
+			Bundle bundle = bundlesMap.getBundle(module);
 
 			if (bundle != null) {
 				appDisplay.addBundle(bundle);
