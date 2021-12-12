diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/XMLLookAndFeelCompatibilityVersionCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/XMLLookAndFeelCompatibilityVersionCheck.java
index bc8b016..96ad32b 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/XMLLookAndFeelCompatibilityVersionCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/XMLLookAndFeelCompatibilityVersionCheck.java
@@ -96,7 +96,7 @@
 			portalVersion = _getPrivatePortalVersion();
 		}
 
-		if (Validator.isNull(portalVersion)) {
+		if (Validator.isNull(portalVersion) || privateApp) {
 			return portalVersion;
 		}
 
