diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/util/SourceFormatterUtil.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/util/SourceFormatterUtil.java
index 841f8a9..ecb825f 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/util/SourceFormatterUtil.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/util/SourceFormatterUtil.java
@@ -598,12 +598,12 @@
 					excludePattern = excludePattern.substring(
 						0, excludePattern.length() - 3);
 
-					_excludeDirPathMatchers.add(
+					excludeDirPathMatcherList.add(
 						_fileSystem.getPathMatcher(
 							excludeSyntax.getValue() + ":" + excludePattern));
 				}
 				else {
-					_excludeFilePathMatchers.add(
+					excludeFilePathMatcherList.add(
 						_fileSystem.getPathMatcher(
 							excludeSyntax.getValue() + ":" + excludePattern));
 				}
