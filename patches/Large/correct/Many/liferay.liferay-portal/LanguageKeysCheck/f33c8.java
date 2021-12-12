diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/LanguageKeysCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/LanguageKeysCheck.java
index 4e0dbb7..2f65b93 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/LanguageKeysCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/LanguageKeysCheck.java
@@ -148,7 +148,7 @@
 					_getLangModuleLanguageProperties(absolutePath);
 
 				if ((langModuleLanguageProperties == null) ||
-					!bndLanguageProperties.containsKey(languageKey)) {
+					!langModuleLanguageProperties.containsKey(languageKey)) {
 
 					addMessage(
 						fileName, "Missing language key '" + languageKey + "'");
