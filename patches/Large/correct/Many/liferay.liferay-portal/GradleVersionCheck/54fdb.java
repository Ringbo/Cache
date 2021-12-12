diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/GradleVersionCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/GradleVersionCheck.java
index b30c7a3..c2a4c58 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/GradleVersionCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/GradleVersionCheck.java
@@ -44,7 +44,7 @@
 			_checkDefaultVersion(
 				fileName, content, name, version, matcher.start());
 
-			if (absolutePath.contains("/modules/apps/") ||
+			if (isSubrepository() || absolutePath.contains("/modules/apps/") ||
 				absolutePath.contains("/modules/private/apps/")) {
 
 				if (!_isTestUtilModule(absolutePath)) {
