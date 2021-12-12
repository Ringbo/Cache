diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/YMLWhitespaceCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/YMLWhitespaceCheck.java
index b480148..e417940 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/YMLWhitespaceCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/YMLWhitespaceCheck.java
@@ -118,7 +118,7 @@
 
 			if (!nestedDefinitionIndent.equals(StringPool.BLANK)) {
 				nestedDefinitions = YMLSourceUtil.getDefinitions(
-					content, nestedDefinitionIndent);
+					definition, nestedDefinitionIndent);
 
 				String newDefinition = _formatDefinitions(
 					definition, nestedDefinitionIndent, level + 1);
@@ -130,8 +130,7 @@
 			}
 
 			String newDefinition = _formatDefinition(
-				definition, nestedDefinitionIndent, level,
-				!nestedDefinitions.isEmpty());
+				definition, indent, level, !nestedDefinitions.isEmpty());
 
 			if (!newDefinition.equals(definition)) {
 				content = StringUtil.replaceFirst(
