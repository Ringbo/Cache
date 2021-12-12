diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/PropertiesLiferayPluginPackageLiferayVersionsCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/PropertiesLiferayPluginPackageLiferayVersionsCheck.java
index ee06b1a..0609457 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/PropertiesLiferayPluginPackageLiferayVersionsCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/PropertiesLiferayPluginPackageLiferayVersionsCheck.java
@@ -81,7 +81,7 @@
 			portalVersion = _getPrivatePortalVersion();
 		}
 
-		if (Validator.isNull(portalVersion)) {
+		if (Validator.isNull(portalVersion) || privateApp) {
 			return portalVersion;
 		}
 
